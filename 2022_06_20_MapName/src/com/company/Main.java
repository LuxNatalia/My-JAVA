package com.company;
/*
1. Дан список Person {name,age} Необходимо сформировать map, где ключ возраст а значение - количество людей данного возраста.
2. Дан список Person {name,age} Необходимо сформировать map, где ключ возраст, а значение - список людей данного возраста.

 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Jan", 25);
        Person p2 = new Person("Lena", 40);
        Person p3 = new Person("John", 30);
        Person p4 = new Person("Pierre", 80);
        Person p5 = new Person("Olga", 67);
        Person p6 = new Person("Nick", 40);
        Person p7= new Person("Serge", 20);
        Person p8= new Person("Oleg", 30);
        Person p9= new Person("Ivan", 20);
        Person p10= new Person("Ivan", 20);

        List<Person> list = new LinkedList<>();

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

        System.out.println(createMapNumbers(list));
        System.out.println(createMapLists(list));


    }

    public static List<Person> peers(List<Person> list, int age){
        List listPeers=new LinkedList();
       for(Person p: list) {
           if(p.getAge()==age){
               listPeers.add(p);
           }
       }
       return listPeers;
    }

    public static Map<Integer, Integer> createMapNumbers(List<Person> list) {
        Map<Integer, Integer> map = new HashMap<>();
        if (list == null || list.isEmpty()) return map;
        for (Person p : list) {
            if (!map.containsValue(p)) {  //здесь проверяется только ключ?
                map.put(p.getAge(), peers(list, p.getAge()).size());

            }
        }
        return map;
    }

    public static Map<Integer, List<Person>> createMapLists(List<Person> list) {
        Map<Integer, List<Person>> map = new HashMap<>();
        if (list == null || list.isEmpty()) return map;
        for (Person p : list) {
            if (!map.containsValue(p)) {
                map.put(p.getAge(), peers(list, p.getAge()));

            }
        }
        return map;
    }


}
