package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<User> list1 = new ArrayList<>();
        List<User> list2 = new ArrayList<>();

        User user1 = new User("Ivan", 111111, "999-023-77-47", "Berlin");
        User user2 = new User("Anna", 222222, "999-555-75-47", "Berlin");
        User user3 = new User("Olga", 333333, "999-666-54-54", "Regensburg");
        User user4 = new User("Pierre", 444444, "959-333-77-40", "Berlin");
        User user5 = new User("James", 555555, "955-222-11-44", "Bremen");
        User user6 = new User("Serge", 626252, "555-456-78-96", "Bremen");
        User user7 = new User("Maria", 212121, "242-741-77-63", "Vien");
        User user8 = new User("Nick", 963852, "988-222-47-56", "Regensburg");
        User user9 = new User("Micke", 777777, "922-741-23-87", "Berlin");
        User user10 = new User("Alex", 888888, "999-023-77-47", "Berlin");
        User user11 = new User("Heinrich", 999999, "977-585-00-07", "Bremen");
        User user12 = new User("Sarah", 159951, "779-201-00-44", "Berlin");
        User user13 = new User("Pierre", 444444, "959-333-77-40", "Berlin");
        User user14 = new User("James", 555555, "955-222-11-44", "Bremen");
        User user15 = new User("Serge", 626252, "555-456-78-96", "Bremen");
        User user16 = new User("Elena", 357753, "999-023-78-47", "Berlin");

        list1.add(user1);
        list1.add(user2);
        list1.add(user3);
        list1.add(user3);
        list1.add(user3);
        list1.add(user4);
        list1.add(user5);
        list1.add(user6);
        list1.add(user7);
        list1.add(user8);

        list2.add(user3);
        list2.add(user3);
        list2.add(user9);
        list2.add(user10);
        list2.add(user11);
        list2.add(user12);
        list2.add(user13);
        list2.add(user14);
        list2.add(user15);
        list2.add(user16);

        System.out.println("____________ list1 _______________");
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println("____________ list2 _______________");
        System.out.println(list2);
        System.out.println(list2.size());

        System.out.println("____________ common elements _______________");
        System.out.println(setOfCommonElements(list1, list2));

    }

    public static Collection<User> setOfCommonElements(Collection<User> list1, Collection<User> list2) {

        Set<User> hashSet1 = new HashSet<>();

        for (User u1 : list2) {
            for (User u2 : list1) {
                if(u1.hashCode()==u2.hashCode()) {
                    if (u1.equals(u2)) {
                        hashSet1.add(u1);
                    }
                }
            }
        }
        return hashSet1;
    }
}