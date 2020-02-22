/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;
import java.util.Map;
import java.util.HashMap;
import lab7.entities.Comment;
import lab7.entities.Post;

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
}
