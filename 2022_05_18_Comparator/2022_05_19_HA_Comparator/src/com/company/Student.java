package com.company;

public class Student {

    private String name;
    private int rating;
    private int absence;

    public Student(String name, int rating, int absence) {
        this.name = name;
        this.rating = rating;
        this.absence = absence;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getAbsence() {
        return absence;
    }

    @Override
    public String toString() {
        return "name= " + name + ", rating= " + rating +
                ", absence=" + absence ;
    }

}
