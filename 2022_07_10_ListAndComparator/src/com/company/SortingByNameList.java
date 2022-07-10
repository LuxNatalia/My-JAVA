package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class SortingByNameList implements Comparator<Student> {

    public int compare(Student student1, Student student2) {
        String str1 = student1.getName();
        String str2 = student2.getName();
        if (str1.compareTo(str2) != 0) return str1.compareTo(str2);
        else return student1.getRating() - student2.getRating();

    }

}
