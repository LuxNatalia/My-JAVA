package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class SortingByAbsenceArray implements Comparator<Student> , TypeOfSorting{


    public int compare(Student student1, Student student2) {
        return student1.getAbsence() - student2.getAbsence();
    }

    @Override
    public Student[] getSortedArray(Student[] students) {

        Arrays.sort(students, new SortingByAbsenceArray());
        return students;
    }
}

