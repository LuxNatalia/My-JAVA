package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class SortingByRatingArray implements Comparator<Student>,TypeOfSorting {


    public int compare(Student student1, Student student2){

        return student1.getRating()-student2.getRating();

    }

    @Override
    public Student[] getSortedArray(Student[] students) {

        Arrays.sort(students, new SortingByRatingArray());
        return students;
    }

}