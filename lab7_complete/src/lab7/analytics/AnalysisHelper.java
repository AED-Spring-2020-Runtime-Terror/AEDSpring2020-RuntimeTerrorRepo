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
        System.out.println("User with most likes: " + max + "\n"
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

        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }

    // average likes per comment
    public void averageLikes() {
        Map<Integer, Comment> allComments = DataStore.getInstance().getComments();
        int totalLikes = 0;
        double totalComments = 0;
        for (Comment comment : allComments.values()) {
            totalLikes += comment.getLikes();
            totalComments += 1;
        }

        double average = totalLikes / totalComments;
        System.out.println("Average like per comment: " + average);
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

    // helper method to return key with maximum value in a Map<Integer, Integer>
    private Integer getKeyWithMaxValue(Map<Integer, Integer> map) {
        Integer maxKey = null;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int thisKey = entry.getKey();
            int thisValue = entry.getValue();
            if (thisValue > maxValue) {
                maxKey = thisKey;
                maxValue = thisValue;
            }
        }
        return maxKey;
    }

    // returns a map where key is userID, and value is total number of posts by user, comments by user and likes for each comment
    private Map<Integer, Integer> getUserTotalActivity() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        Map<Integer, Integer> userActivity = new HashMap<>();

        // get total posts for each user
        for (Post post : posts.values()) {
            int userID = post.getUserId();
            int currentUserStats = userActivity.containsKey(userID) ? userActivity.get(userID) : 0;
            currentUserStats += 1;
            userActivity.put(userID, currentUserStats);
        }

        // get total comments and likes for comments for each user
        for (Comment comment : comments.values()) {
            int userID = comment.getUserId();
            int currentUserStats = userActivity.containsKey(userID) ? userActivity.get(userID) : 0;
            currentUserStats += 1; // incrementing stats by one for the comment
            currentUserStats += comment.getLikes(); // incrementing stats by number of likes
            userActivity.put(userID, currentUserStats);
        }

        return userActivity;
    }

    // if parameter passed is true, method determines most proactive top 5 users
    // if parameter passed is false, method determines most inactive top 5 users
    private void top5Users(boolean isProactive) {
        Map<Integer, Integer> userTotalActivity = getUserTotalActivity();

        List<Integer> top5Users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Integer currentUserID = null;
            if (isProactive) {
                currentUserID = getKeyWithMaxValue(userTotalActivity);
            } else {
                currentUserID = getKeyWithMinValue(userTotalActivity);
            }
            if (currentUserID != null) {
                top5Users.add(currentUserID);
                userTotalActivity.remove(currentUserID);
            }
        }

        if (isProactive) {
            System.out.println("5 most proactive users overall (based on posts, comments, likes): ");
        } else {
            System.out.println("5 most inactive users overall (based on posts, comments, likes): ");
        }
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        for (Integer userID : top5Users) {
            System.out.println(users.get(userID));
        }
    }

    public void top5ProactiveUsers() {
        top5Users(true);
    }

    public void top5InactiveUsers() {
        top5Users(false);
    }
}
