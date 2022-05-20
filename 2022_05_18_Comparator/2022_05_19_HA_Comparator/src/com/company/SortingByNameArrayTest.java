package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingByNameArrayTest {
    @Test
    public void isArrayByNameSorted_shouldBeTrue() {
        Student[] students1 = {
                new Student("Boris", 41, 2),
                new Student("Nick", 20, 5),
                new Student("Mike", 30, 10),
                new Student("Lena", 27, 0),
                new Student("Rosa", 25, 1),
                new Student("Paul", 69, 8)};
        SortingByNameArray sortingByNameArray = new SortingByNameArray();
        Student[] students2 = sortingByNameArray.getSortedArray(students1);
        Student[] studentsExpected = {
                new Student("Boris", 41, 2),
                new Student("Lena", 27, 0),
                new Student("Mike", 30, 10),
                new Student("Nick", 20, 5),
                new Student("Paul", 69, 8),
                new Student("Rosa", 25, 1)
        };
        boolean result=true;
        for (int i = 0; i < students2.length; i++) {
            if(students2[i].getName().equals(studentsExpected[i].getName()) && students2[i].getRating()==studentsExpected[i].getRating() && students2[i].getAbsence()==studentsExpected[i].getAbsence()) {

            }else {
                result=false;
            }
        }
        Assertions.assertTrue(result);
    }
    @Test
    public void isArrayByNameSorted_shouldBeFalse() {
        Student[] students1 = {
                new Student("Boris", 41, 2),
                new Student("Nick", 20, 5),
                new Student("Mike", 30, 10),
                new Student("Lena", 25, 0),
                new Student("Rosa", 25, 1),
                new Student("Paul", 69, 1)};
        SortingByNameArray sortingByNameArray = new SortingByNameArray();
        Student[] students2 = sortingByNameArray.getSortedArray(students1);
        Student[] studentsExpected = {
                new Student("Boris", 41, 2),
                new Student("Lena", 25, 0),
                new Student("Paul", 69, 1),
                new Student("Mike", 30, 10),
                new Student("Nick", 20, 5),
                new Student("Rosa", 25, 1)
        };
        boolean result=true;
        for (int i = 0; i < students2.length; i++) {
            if(students2[i].getName().equals(studentsExpected[i].getName()) && students2[i].getRating()==studentsExpected[i].getRating() && students2[i].getAbsence()==studentsExpected[i].getAbsence()) {

            }else {
                result=false;
            }
        }
        Assertions.assertFalse(result);
    }


}