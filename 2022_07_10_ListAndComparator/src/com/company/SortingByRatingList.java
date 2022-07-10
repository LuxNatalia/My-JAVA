package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class SortingByRatingList implements Comparator<Student> {


    public int compare(Student student1, Student student2) {
        if (student1.getRating() != student2.getRating())
            return student1.getRating() - student2.getRating();
        else return student1.getName().compareTo(student2.getName());
    }

}
