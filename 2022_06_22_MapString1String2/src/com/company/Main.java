package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Hallo ", "Jan ");
        map.put("Good bye ", "James ");
        map.put("Guten Tag ", "Olga ");
        map.put("Salut ", "Pierre ");
        map.put("Grüß Gott ", "Sven ");
        map.put("Привет ", "Наташа ");
        map.put("Morgen ", "Sylvie ");
        map.put("Good morning ", "Svetlana ");
        map.put("Gute Nacht ", "Serge ");
        System.out.println(map);

        String string1 = "Hallo ";
        String string2 = "Salut ";

        System.out.println(mapAB(map, string1, string2));

        Set<String> setString = new HashSet<>();
        setString.add("Hallo ");
        setString.add("Salut ");
        setString.add("Morgen ");
        setString.add("Привет ");

        System.out.println(setString);
        mapPlusStringSet(map, setString);
        System.out.println(map);
    }

    // можно void
    public static Map<String, String> mapAB(Map<String, String> map, String string1, String string2) {
        if (string1 == null || string2 == null || map == null || map.isEmpty()) return map;
        if (map.containsKey(string1) && map.containsKey(string2)) {
            String key12;
            key12 = string1 + string2;
            String value1 = map.get(string1);
            String value2 = map.get(string2);
            if (value1 != null && value2 != null) {
                String value12;
                value12 = map.get(string1) + map.get(string2);
                map.put(key12, value12);
            }
        }
        return map;
    }

    public static void mapPlusStringSet(Map<String, String> map, Set<String> set) {
        if (set == null || set.isEmpty() || map == null || map.isEmpty()) return ;
        if (map.keySet().containsAll(set)) {
            String keyNew = new String();
            String valueNew = new String();
            for (String s : set) {
                keyNew = keyNew + s;
                valueNew = valueNew + map.get(s);
            }

            map.put(keyNew, valueNew);
        }

    }

}
