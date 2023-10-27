package com.coherentsolutions;public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Movie movie = new Movie();

        movie.setTitle("Star Wars");
        movie.setDirector("George Lucas");
        movie.setYearOfProduction(1977);

        System.out.println("Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Year of Production: " + movie.getYearOfProduction());

        movie.displayInfo();


    }
}