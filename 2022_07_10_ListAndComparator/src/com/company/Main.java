package com.company;
/*Реализовать обобщенный метод  который, получая  лист  и  Comparator,
 возвращает упорядоченный в соответствие с заданным компаратором лист из объектов исходного листа,
 но без повторов. */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> listInt = List.of(1, 2, 3, 3, 7, 2, 7, 5, 6);
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        List<Integer> l1 = removeDuplicatesAndSort(listInt, c1);

        Comparator<String> c2 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        List<String> l2 = removeDuplicatesAndSort(List.of("q", "rty", "yu", "q", "rty"), c2);

        System.out.println(l1);
        System.out.println("______Sorting by length______");
        System.out.println(l2);

        System.out.println("__________________________________");
        List<Student> students = List.of(new Student("Boris", 80),
                new Student("Anna", 29),
                new Student("Maria", 15),
                new Student("Boris", 80),
                new Student("Anna", 29),
                new Student("Maria", 15),
                new Student("Boris", 80),
                new Student("Anna", 29),
                new Student("Boris", 80),
                new Student("Leon", 75),
                new Student("Theodor", 42),
                new Student("Theodor", 40),
                new Student("Serge", 40));
        System.out.println("______Without sorting______");
        System.out.println(students);
        Comparator<Student> c3 = new SortingByNameList();
        Comparator<Student> c4 = new SortingByRatingList();
        System.out.println("______Sorting by name______");
        System.out.println(removeDuplicatesAndSort(students, c3));
        System.out.println("______Sorting by rating______");
        System.out.println(removeDuplicatesAndSort(students, c4));


    }

    public static <T> ArrayList<T> removeDuplicatesAndSort(List<T> list, Comparator<T> c) {
        ArrayList<T> result = new ArrayList<>(new HashSet<T>(list));
        result.sort(c);
        return result;


    }


}
