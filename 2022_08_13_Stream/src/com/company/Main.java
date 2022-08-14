package com.company;
//1)    Дан список Person (String firstName, String lastName, int age) используя Stream найти самого молодого Person. Приведите все решения, которые вы знаете.
//2)    Дан список Person (String firstName, String lastName, int age) используя Stream получить map, где ключ ФИО в формате Иванов.И, значение возраст.
// 3)    Дан лист строк, нужно получить Map, где ключ - строка, значение - true, если строка встретилась более одного раза, иначе false
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Main {

    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        Person p1 = new Person("Serge", "Nikitine", 25);
        Person p2 = new Person("James", "Nikitine", 36);
        Person p3 = new Person("Pierre", "Nikitine", 42);
        Person p4 = new Person("Luise", "Kapus", 18);
        Person p5 = new Person("Nick", "Kapus", 15);
        Person p6 = new Person("Elena", "Berg", 18);
        Person p7 = new Person("Alex", "Stein", 9);
        Person p8 = new Person("Nick", "Stein", 31);
        Person p9 = new Person("Elena", "Stein", 17);
        Person p10 = new Person("Arnold", "Lux", 60);
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
        //System.out.println(list);
        list.stream()
                .forEach(p-> System.out.println(p));

        //найти самого молодого Person
        System.out.println("______________1.1_____________");

        Optional<Person> PersonWithMinAge = list.stream()
                .min(Comparator.comparing(p->p.getAge()));
        System.out.println(PersonWithMinAge);

        System.out.println("_____________1.2_____________");
        list.stream()
                .sorted(Comparator.comparing(p->p.getAge()))
                .limit(1)
                .forEach(p-> System.out.println(p));
        System.out.println("_______________1.3____________");
        /* НЕ ПОЛУЧИЛОСЬ
        Person reduce1 = list.stream()
                .reduce(10000, (Integer minAge, Person p) -> {Math.min(minAge, p.getAge()); return p;
                };
        System.out.println(reduce1);*/

        Integer reduce = list.stream()
                .map(i -> i.getAge())
                .reduce(10000, (minAge, i) -> Math.min(minAge, i));
        System.out.println("минимальный возраст  "+reduce);


        System.out.println("_________________2______________________");
        //получить map, где ключ ФИО в формате Иванов.И, значение возраст
        Map<String, Integer> nameAgeMap = list.stream()
                .collect(toMap((Person p) -> p.getLastName() + "."+ p.getFirstName().charAt(0) + " " , (Person p) -> p.getAge()));

        System.out.println(nameAgeMap);


        System.out.println("___________3_________________");
        //Дан лист строк, нужно получить Map, где ключ - строка, значение - true, если строка встретилась более одного раза, иначе false
        //сначала создадим list <String> из фамилий
        List<String> lastNames = list.stream()
                .map(p -> p.getLastName())
                .collect(Collectors.toList());

        System.out.println("Список фамилий : ");
        lastNames.forEach(p-> System.out.println(p));

        System.out.println("Решение : ");
        Map<String, Boolean>  mapLastNames=lastNames.stream()
                .collect(toMap(s -> s, s -> false, (s1, s2) -> true));


        System.out.println(mapLastNames);


    }

public static class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ") ";
    }
}
}