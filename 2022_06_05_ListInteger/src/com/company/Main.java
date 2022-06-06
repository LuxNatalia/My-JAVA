package com.company;

import java.util.*;
/* 1. "Перевернуть" List<Integer>;
2. Из List, где все элементы Integer, кроме одного, имеют пару, выбрать непарный элемент*/

public class Main {

    public static void main(String[] args) {
        Integer num1 = 5;
        Integer num2 = 20;
        Integer num3 = 2;
        Integer num4 = 99;
        Integer num5 = 17;
        Integer num6 = 31;
        Integer num7 = 8;

        List<Integer> list=new ArrayList<>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        list.add(num6);
        list.add(num7);
        System.out.println("list size "+ list.size());
        System.out.println();

        printList(list);
        System.out.println();

        printList(reverceList(list));
        System.out.println();

        System.out.println("______Unpaired element________");
        List<Integer> pairedElementsList=new ArrayList<>();
        pairedElementsList.add(num1);
        pairedElementsList.add(num2);
        pairedElementsList.add(num3);
        pairedElementsList.add(num4);
        pairedElementsList.add(num5);
        pairedElementsList.add(num6);
        pairedElementsList.add(num7);
        pairedElementsList.add(num5);
        pairedElementsList.add(num2);
        pairedElementsList.add(num3);
        pairedElementsList.add(num4);
        pairedElementsList.add(num6);
        pairedElementsList.add(num1);
        System.out.println("list size "+ pairedElementsList.size());
        System.out.println();

        printList(pairedElementsList);
        System.out.println();
        System.out.println("Unpaired element : "+(unpairedElement(pairedElementsList)));
       // Collections.sort(pairedElementsList);
       // printList(pairedElementsList);

    }
    public static void printList(List<Integer> list){
       for (int i = 0; i < list.size(); i++) {

        //for(int i: list){ не работает; что не так?
            System.out.print(list.get(i) + "  ");
        }
    }


    public static List<Integer> reverceList(List<Integer> list){
        List<Integer> newList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            newList.add(list.get(list.size()-i-1));
        }
        return newList;
    }

    public static Integer unpairedElement(List<Integer> list){
        Collections.sort(list);
        Integer withoutPair;
        int i=0;
        while(list.get(i).equals(list.get(i+1))){
            i=i+2;
        }
        withoutPair= list.get(i);
        return withoutPair;
    }


}
