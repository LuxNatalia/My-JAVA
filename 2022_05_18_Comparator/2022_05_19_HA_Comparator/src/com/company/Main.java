package com.company;
/* Сортировка массива студентов по имени, рейтингу или прогулам. Тесты*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student[] students = {
                new Student("Boris", 80, 0),
                new Student("Anna", 29, 5),
                new Student("Maria", 15, 10),
                new Student("Leon", 75, 2),
                new Student("Theodor", 42, 7),
                new Student("Serge", 68, 1)};

        Scanner scanner = new Scanner(System.in);
        int typeSorting;

        do {
            System.out.println(" select a sorting method: ");
            System.out.println("1 - sorting by name; 2 - sorting by rating; 3 - sorting by absence");
            typeSorting = scanner.nextInt();
        } while (typeSorting < 1 || typeSorting > 3);

        System.out.println("______Before sorting______");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        FactoryTypeSorting factory = new FactoryTypeSorting();
        TypeOfSorting sort = factory.getTypeOfSorting(typeSorting);

        System.out.println();
        switch (typeSorting) {
            case 1:
                System.out.println( "____Sorting by name____");
                break;
            case 2:
                System.out.println( "____Sorting by rating____");
                break;
            case 3:
                System.out.println("____Sorting by absence____");
                break;
        }
        System.out.println();
        System.out.println("_____After sorting______");

        for (int i = 0; i < students.length; i++) {
            System.out.println(sort.getSortedArray(students)[i]);
        }
    }
}
