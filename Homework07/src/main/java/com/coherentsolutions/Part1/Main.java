package com.coherentsolutions.Part1;

public class Main {
    public static void main(String[] args) {
        /* Creates a platform */
        BloggingPlatform platform = new BloggingPlatform();

        /* create 3 new posts */
        BlogPost post1 = new BlogPost("Java Basics");
        post1.addTag("Java");
        post1.addTag("Programming");

        BlogPost post2 = new BlogPost("Web development with java");
        post2.addTag("Java");
        post2.addTag("Web development");

        BlogPost post3 = new BlogPost("Java8 Features");
        post3.addTag("Java");
        post3.addTag("Java8");
        post3.addTag("Programming");

        /* add new posts to the platform */
        platform.addBlogPost(post1);
        platform.addBlogPost(post2);
        platform.addBlogPost(post3);

        /* obtain all unique tags on the platform */
        System.out.println("All unique Tags: " + platform.getAllTags() + "\n");


        /* Posts with tag 'Java' */
        platform.displayPostsByTag("Java");

        /* Similar tags for tag 'Java' */
        System.out.println("\nSuggested similar for 'Java' : " + platform.suggestSimilarTags("Programming"));

    }
}