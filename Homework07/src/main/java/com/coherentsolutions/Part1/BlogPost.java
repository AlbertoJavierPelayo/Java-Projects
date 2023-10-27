package com.coherentsolutions.Part1;

import java.util.HashSet;

/**
 * This Class named BlogPost represents a blog post with tags
 */
public class BlogPost {
    private String title;
    private HashSet<String> tags;

    /**
     * Constructor that creates a new blog post with the given title
     * @param title The title of the blog post
     */
    public BlogPost(String title) {
        this.title = title;
        this.tags = new HashSet<>();
    }

    /**
     * Adds a tag to the blog post
     * @param tag The tag to add
     */
    public void addTag(String tag){
        tags.add(tag);
    }

    /**
     * Removes a tag from the blog post
     * @param tag The tag to remove
     */
    public void removeTag(String tag){
        tags.remove(tag);
    }

    /**
     * Gets the tags associated to the blog post
     * @return A set tags
     */
    public HashSet<String> getTags() {
        return tags;
    }

    /**
     * Gets the title of the blog post
     * @return The title of the blog post
     */
    public String getTitle() {
        return title;
    }
}
