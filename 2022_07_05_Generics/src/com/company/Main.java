package com.company;
//Реализация MyArrayList для разных типов
public class Main {

    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "bbb";
        String str3 = "ccc";
        String str4 = "ddd";
        String str5 = "eee";
        String str6 = "fff";
        String str7 = "ggg";
        String str8 = "hhh";
        String str9 = "iii";


        MyArrayList<String> myArrayList1 = new MyArrayList<String>();
        myArrayList1.add(str1);
        myArrayList1.add(str2);
        myArrayList1.add(str3);
        myArrayList1.add(str4);
        myArrayList1.add(str5);
        myArrayList1.add(str6);
        myArrayList1.add(str7);
        myArrayList1.add(str8);
        myArrayList1.add(str9);
        System.out.println(myArrayList1);
        System.out.println("5 element is " + myArrayList1.get(5));
        System.out.println("____________________________________");

        MyArrayList<Integer> myArrayList2 = new MyArrayList<Integer>();
        Integer int1 = 10;
        Integer int2 = 20;
        Integer int3 = 30;
        Integer int4 = 40;
        Integer int5 = 50;
        Integer int6 = 60;
        Integer int7 = 70;
        Integer int8 = 80;
        Integer int9 = 90;
        Integer int10 = 100;
        Integer int11 = 110;
        Integer int12 = 120;
        myArrayList2.add(int1);
        myArrayList2.add(int2);
        myArrayList2.add(int3);
        myArrayList2.add(int4);
        myArrayList2.add(int5);
        myArrayList2.add(int6);
        myArrayList2.add(int7);
        myArrayList2.add(int8);
        myArrayList2.add(int9);
        myArrayList2.add(int10);
        myArrayList2.add(int11);
        myArrayList2.add(int12);


        System.out.println(myArrayList2);
        System.out.println("5 element is " + myArrayList2.get(5));
        System.out.println("_____________________________");

        Employee e1 = new Employee("Lena", 20000);
        Employee e2 = new Employee("Georg", 100000);
        Employee e3 = new Employee("Sofia", 50000);

        MyArrayList<Employee> myArrayList3 = new MyArrayList<Employee>();

        myArrayList3.add(e1);
        myArrayList3.add(e2);
        myArrayList3.add(e3);
        System.out.println(myArrayList3);
        System.out.println("0 element is " + myArrayList3.get(0));


    }
}
