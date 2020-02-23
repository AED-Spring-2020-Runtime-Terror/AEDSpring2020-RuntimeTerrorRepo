/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {

    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();

        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("\n User with most likes: " + max + "\n"
                + users.get(maxId));
    }

    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());

        Collections.sort(commentList, new Comparator<Comment>() {
            @Override
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });

        System.out.println("\n 5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }

    //Find the post with most liked comments.
    public void getPostWithMostLikedComment() {
        Map<Integer, Integer> postLikesCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        for (Post p : posts.values()) {
            for (Comment c : p.getComments()) {
                int likes = 0;
                if (postLikesCount.containsKey(p.getPostId())) {
                    likes = postLikesCount.get(p.getPostId());
                }
                likes += c.getLikes();
                postLikesCount.put(p.getPostId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : postLikesCount.keySet()) {
            if (postLikesCount.get(id) > max) {
                max = postLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("\nPost with most likes: " + max + "\n"
                + posts.get(maxId));
    }

    // Top 5 inactive users based on total posts.
    public void top5InactiveUsersBasedOnPosts() {
        Map<Integer, Integer> postCountForUsers = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        for (Post post : posts.values()) {
            int userID = post.getUserId();
            int currentNumOfPostsForUser = 0;
            if (postCountForUsers.containsKey(userID)) {
                currentNumOfPostsForUser = postCountForUsers.get(userID);
            }
            currentNumOfPostsForUser++;
            postCountForUsers.put(userID, currentNumOfPostsForUser);
        }

        List<Integer> top5InactiveUsers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Integer currentMostInactiveUser = getKeyWithMinValue(postCountForUsers);
            if (currentMostInactiveUser != null) {
                top5InactiveUsers.add(currentMostInactiveUser);
                postCountForUsers.remove(currentMostInactiveUser);
            }
        }
        Map<Integer, User> usersMap = DataStore.getInstance().getUsers();
        System.out.println("\n5 most inactive users based on total posts: ");
        for (Integer userID : top5InactiveUsers) {
            System.out.println(usersMap.get(userID));
        }
    }

    // helper method to return key with minimum value in a Map<Integer, Integer>
    private Integer getKeyWithMinValue(Map<Integer, Integer> map) {
        Integer minKey = null;
        int minValue = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int thisKey = entry.getKey();
            int thisValue = entry.getValue();
            if (thisValue < minValue) {
                minKey = thisKey;
                minValue = thisValue;
            }
        }
        return minKey;
    }

}
