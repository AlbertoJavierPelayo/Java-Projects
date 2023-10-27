package com.coherentsolutions.Part1;

import java.util.*;

/**
 * This class named BloggingPlatform represents a blogging platform that manages blog posts and tags
 */
public class BloggingPlatform {
    private HashSet<BlogPost> blogPosts;
    private HashSet<String> allTags;
    private Map<String, Set<String>> tagSimilarities;

    /**
     * Constructor to create a new blogging platform
     */
    public BloggingPlatform() {
        blogPosts = new HashSet<>();
        allTags = new HashSet<>();
        tagSimilarities = new HashMap<>();
    }

    /**
     * Method to add a blog post to the platform
     * @param post The blog post to add
     */
    public void addBlogPost(BlogPost post){
        blogPosts.add(post);
        HashSet<String> postTags =  post.getTags();
        allTags.addAll(postTags);

        for (String tag :  postTags){
            if(!tagSimilarities.containsKey(tag)){
                tagSimilarities.put(tag, new HashSet<>());
            }
            for (String otherTag : postTags){
                if(!tag.equals(otherTag)){
                    tagSimilarities.get(tag).add(otherTag);
                }
            }
        }
    }

    /**
     * Method to remove a blog post from the platform
     * @param post The post to remove
     */
    public void removeBlogPost(BlogPost post){
        blogPosts.remove(post);
        allTags.removeAll(post.getTags());

        for (String tag : post.getTags()){
            tagSimilarities.remove(tag);
            for (Set<String> similarTags : tagSimilarities.values()){
                similarTags.remove(tag);
            }
        }
    }

    /**
     * Method to display all the posts associated to a specific tag
     * @param tag The tag to filter by
     */
    public void displayPostsByTag(String tag){
        System.out.println("Posts with tag '" + tag + "':");
        for (BlogPost post : blogPosts){
            if (post.getTags().contains(tag)){
                System.out.println(post.getTitle());
            }
        }
    }

    /**
     * method to get all unique tags across all posts on the platform
     * @return A set od all unique tags
     */
    public HashSet<String> getAllTags(){
        return allTags;
    }

    /**
     * (Bonus) Method to suggest similar tags for a given tag based on existing tag similarities
     * @param tag The tag for which to suggest similar tags
     * @return A set of suggested tags
     */
    public Set<Object> suggestSimilarTags(String tag){
        if(tagSimilarities.containsKey(tag)){
            return Collections.singleton(tagSimilarities.get(tag));
        }
        return Collections.emptySet();
    }

}
