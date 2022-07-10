package com.company;
/* Реализовать обобщенный метод  который получая  лист возвращает map, где ключом является объект,
а значением, сколько раз этот объект встречается в исходном листе.*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

     public static void main(String[] args) {
        List<Integer> listInt=List.of(1,2,3,3,7,2,7,5,6,2,2,2,7,5);
        System.out.println(listInt);
        System.out.println(countingByObjects(listInt));
        System.out.println("_____________________________");
        List<String> listString=List.of("aaa","bbb","ccc","ddd","aaa","aaa","aaa","bbb","bbb","ccc");
        System.out.println(listString);
        System.out.println(countingByObjects(listString));
        System.out.println("_____________________________");
        Person p1 = new Person("Jan", 25);
        Person p2 = new Person("Lena", 40);
        Person p3 = new Person("Lena", 30);
        Person p4 = new Person("Pierre", 80);
        Person p5 = new Person("Oleg", 30);
        Person p6 = new Person("Lena", 40);
        Person p7= new Person("Ivan", 20);
        Person p8= new Person("Oleg", 30);
        Person p9= new Person("Ivan", 20);
        Person p10= new Person("Ivan", 20);

        List<Person> listPersons = new ArrayList<>();

        listPersons.add(p1);
        listPersons.add(p2);
        listPersons.add(p3);
        listPersons.add(p4);
        listPersons.add(p5);
        listPersons.add(p6);
        listPersons.add(p7);
        listPersons.add(p8);
        listPersons.add(p9);
        listPersons.add(p10);
        System.out.println(listPersons);
        System.out.println(countingByObjects(listPersons));

    }
    public static <T> Map<T,Integer> countingByObjects(List<T> list) {
        Map<T, Integer> map = new HashMap<>();
        if (list == null || list.isEmpty()) return map;

        for (T p : list) {
            Integer value = map.get(p);

            if (value != null) {
                map.put(p, value + 1);
            } else {
                map.put(p, 1);
            }
        }
        return map;

    }

}
