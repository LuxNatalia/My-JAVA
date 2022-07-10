package com.company;

import java.util.Objects;

public class Student {

    private String name;
    private int rating;


    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getRating() == student.getRating() && Objects.equals(getName(), student.getName());
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + " (" + rating + ") ";
    }

}
