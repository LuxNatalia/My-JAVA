package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Adress a1 = new Adress("111111", "Berlin", "Fridrichstrasse", "5A");
        Adress a2 = new Adress("222222", "Berlin", "Marienstrasse", "23");
        Adress a3 = new Adress("333333", "Regensburg", "Bahnhofstrasse", "9");
        Adress a4 = new Adress("444444", "Regensburg", "Albertstrasse", "1/3");
        Adress a5 = new Adress("555555", "Leipzig", "Jahnallee", "15");

        Person p1 = new Person("Serge", "Nikitine", "serge@gmail.de", "+49111111111", a1);
        Person p2 = new Person("James", "Nikitine", "james@gmail.de", "+49111111112", a1);
        Person p3 = new Person("Silvye", "Nikitine", "sylvie@gmail.de", "+49111111113", a1);
        Person p4 = new Person("Anna", "Utkina", "anna@gmail.de", "+49222222222", a2);
        Person p5 = new Person("Nick", "Utkin", "nick@gmail.de", "+492222222223", a2);
        Person p6 = new Person("Elena", "Berg", "elena@gmail.de", "+49333333333", a3);
        Person p7 = new Person("Alex", "Stein", "alex@gmail.de", "+49444444444", a4);
        Person p8 = new Person("Nick", "Stein", "nicks@gmail.de", "+49444444445", a4);
        Person p9 = new Person("Elena", "Stein", "elenas@gmail.de", "+494444444446", a4);
        Person p10 = new Person("Olga", "Rosenbaum", "olga@gmail.de", "+49555555555", a5);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);

        System.out.println(list);
        System.out.println(getListOfElements(list, new SelectName()));
        System.out.println(getListOfElements(list, new SelectEmail()));
        System.out.println(getListOfElements(list, new SelectPhone()));
        System.out.println(getListOfElements(list, new SelectAdress()));


    }

    public static List<String> getListOfElements(List<Person> list, SelectItem selectItem) {
        List<String> newList = new ArrayList<>();
        for (Person p : list) {
            newList.add(selectItem.select(p));

        }
        return newList;

    }
}
