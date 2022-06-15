package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<User> list1=new ArrayList<>();
    List<User> list2=new ArrayList<>();
    List<User> list3=new ArrayList<>();

        User user1=new User("Ivan", 111111, "999-023-77-47", "Berlin" );
        User user2=new User("Anna", 222222, "999-555-75-47", "Berlin" );
        User user3=new User("Olga", 333333, "999-666-54-54", "Regensburg" );
        User user4=new User("Pierre", 444444, "959-333-77-40", "Berlin" );
        User user5=new User("James", 555555, "955-222-11-44", "Bremen" );
        User user6=new User("Serg", 626252, "555-456-78-96", "Bremen" );
        User user7=new User("Maria", 212121, "242-741-77-63", "Vien" );
        User user8=new User("Nick", 963852, "988-222-47-56", "Regensburg" );
        User user9=new User("Micke", 777777, "922-741-23-87", "Berlin" );
        User user10=new User("Alex", 888888, "999-023-77-47", "Berlin" );
        User user11=new User("Heinrich", 999999, "977-585-00-07", "Bremen" );
        User user12=new User("Sahra", 159951, "779-201-00-44", "Berlin" );
        User user13=new User("Pierre", 444444, "959-333-77-40", "Berlin" );
        User user14=new User("James", 555555, "955-222-11-44", "Bremen" );
        User user15=new User("Serg", 626252, "555-456-78-96", "Bremen" );
        User user16=new User("Elena", 357753, "999-023-78-47", "Berlin" );

        list1.add(user1);
        list1.add(user2);
        list1.add(user3);
        list1.add(user4);
        list1.add(user5);
        list1.add(user6);
        list1.add(user7);
        list1.add(user8);
        list1.add(user9);
        list1.add(user10);
        list1.add(user16);

        list2.add(user7);
        list2.add(user8);
        list2.add(user9);
        list2.add(user10);
        list2.add(user11);
        list2.add(user12);
        list2.add(user13);
        list2.add(user14);
        list2.add(user15);
        list2.add(user16);

        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println("___________________________");
        System.out.println(list2);
        System.out.println(list2.size());

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).hashCode()==list2.get(j).hashCode()){
                      if (list1.get(i).equals(list2.get(j))){
                        list3.add(list1.get(i));
                      }
                }
            }
        }
        System.out.println("________identical elements_________");
        System.out.println(list3);
    }
}
