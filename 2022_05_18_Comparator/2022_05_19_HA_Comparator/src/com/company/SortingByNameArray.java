package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class SortingByNameArray implements Comparator<Student>,TypeOfSorting {

    public int compare(Student student1, Student student2){
       String str1=student1.getName();
       String str2=student2.getName();

        return str1.compareTo(str2);

    }

    @Override
    public Student[] getSortedArray(Student[] students) {

        Arrays.sort(students, new SortingByNameArray());
        return students;
    }
}
