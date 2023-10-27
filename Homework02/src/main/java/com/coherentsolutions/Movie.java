package com.coherentsolutions;

public class Movie {
    //Attributes
    private String title;
    private String director;
    private int yearOfProduction;
    //Methods
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title=title; }
    public String getDirector() { return director; }
    public void setDirector(String director) { this.director=director; }
    public int getYearOfProduction() { return yearOfProduction; }
    public void setYearOfProduction(int yearOfProduction) {
        if(yearOfProduction>=0 && yearOfProduction<=2023)
        {
            this.yearOfProduction=yearOfProduction;
        }
        else{
            System.out.println("Error: The Year of Production for this movie must be a positive integer and not in the future");
        }
    }
    public void displayInfo(){
        System.out.println("Title: " + this.title);
        System.out.println("Director: " + this.director);
        System.out.println("Year of Production: " + this.yearOfProduction);
    }


}
