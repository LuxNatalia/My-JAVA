package com.company;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	Set set=new HashSet<>();
   set.add(1);
   set.add(2);
   set.add(3);
   set.add(4);
   set.add(5);
   set.add(6);
   set.add(7);
   set.add(8);
   set.add(9);
   set.add(10);

   System.out.println(set);
        System.out.println(summSet(set));

    }

    public static Integer summSet(Set<Integer> set){
        Integer summ=0;
        for(Integer i: set){
            summ=summ+i;
        }
        return summ;
    }

}
