package com.company;
//Collections Arrays, List
// Добавление, удаление и отбор элементов связанного списка

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Ja", 25);
        Person p2 = new Person("Le", 27);
        Person p3 = new Person("John", 30);
        Person p4 = new Person("P", 80);
        Person p5 = new Person("Olga", 67);
        Person p6 = new Person("Nic", 44);

        List<Person> list = new LinkedList<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "  ");


        }
        System.out.println();

        list.remove(0);
        System.out.println(list);

        int[] array = {1, 2, 3, 4};
        array = Arrays.copyOf(array, 10);
        //array=Arrays.copyOfRange(array, 0, 2);
        System.out.println(Arrays.toString(array));
        System.arraycopy(array, 0, array, 6, 2);


        System.out.println(Arrays.toString(array));

        System.out.println("___________________________");

        PersonLinkedList myList = new PersonLinkedList();
        myList.add(p1);
        myList.add(p2);
        myList.add(p3);
        myList.add(p4);
        myList.add(p5);
        System.out.println(myList.size);
        myList.print();

        System.out.println("method nameShorterThan4List");
        myList.nameShorterThan4List(myList).print();


        System.out.println("Method get");
        System.out.println(myList.get(1));

       System.out.println("Method remove");
        myList.remove(0);
        myList.print();

        System.out.println("method addInIndex");
        myList.addInIndex(p6, 4);
        myList.print();

/* Если метод method nameShorterThan4List вызывается последним, то выдается ошибка
     Exception in thread "main" java.lang.NullPointerException
	at com.company.PersonLinkedList.nameShorterThan4List(PersonLinkedList.java:115)
	at com.company.Main.main(Main.java:73)
	 Если при этом убрать метод remove, то все работает.
	 Не смогла найти причину этого явления*/

    }
}
