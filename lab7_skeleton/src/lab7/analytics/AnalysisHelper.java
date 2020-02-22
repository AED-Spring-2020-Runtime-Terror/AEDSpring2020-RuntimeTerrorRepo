/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;
/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
   public void getPostWithMostComments() {
        Map<Integer, Integer> postCommentsCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int comments = 0;
        for (Post post : posts.values()) {

            for (Comment c : post.getComments()) {
                comments = comments + 1;
            }
            postCommentsCount.put(post.getPostId(), comments);

        }
        int max = 0;
        int maxId = 0;
        for (int id : postCommentsCount.keySet()) {
            if (postCommentsCount.get(id) > max) {
                max = postCommentsCount.get(id);
                maxId = id;
            }
        }
        System.out.println("Post with most likdes " + max + "\n"
                + posts.get(maxId));
    }
     public void inactiveUsers_based_on_comments() {

        Map<Integer, User> users = DataStore.getInstance().getUsers();

        List<User> userCommentList = new ArrayList<>(users.values());

        Collections.sort(userCommentList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getComments().size() - o2.getComments().size();
            }
        });
        System.out.println("% top 5 inactive users based on comments:");
        for (int i = 0; i < userCommentList.size() && i < 5; i++) {
            System.out.println(userCommentList.get(i));
        }

    }
}



