package com.company;
/**
 * Реализовать программу, которая генерирует все [допустимые”] скобочные последовательности длинной 2*n
 */



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	int num=4;
        System.out.println("Все последовательности скобок длины "+2*num);
        System.out.println(sequencesOfBrackets(num));
        System.out.println("Все допустимые последовательности скобок длины "+2*num);
        if (num<=0){
            System.out.println("null");
        } else {
            Set setOfSequences = Set.copyOf(permissibleSequencesOfBrackets(num));
            System.out.println(setOfSequences);
        }
    }


    public static List<String> sequencesOfBrackets(int num){

        if(num==1){
            List<String> listOfSequences=new ArrayList<>();
           listOfSequences.add("((");
           listOfSequences.add("))");
           listOfSequences.add("()");
           listOfSequences.add(")(");
            return listOfSequences;
        }
        if(num>1){
            List<String> listOfSequences=new ArrayList<>();
            for (int i = 0; i < sequencesOfBrackets(num-1).size(); i++) {
                for (int j = 0; j < 4; j++) {
                    listOfSequences.add(sequencesOfBrackets(num - 1).get(i) + sequencesOfBrackets(1).get(j));
                }
            }
            return listOfSequences;
        }else return null;
    }
    public static List<String> permissibleSequencesOfBrackets(int num){
        if(num==1){
            List<String> listOfSequences=new ArrayList<>();
            listOfSequences.add("()");

            return listOfSequences;
        }
        if(num>1){
            List<String> listOfSequences=new ArrayList<>();
            for (int i = 0; i < permissibleSequencesOfBrackets(num-1).size(); i++) {
                    listOfSequences.add(permissibleSequencesOfBrackets(num - 1).get(i)+"()");
                    listOfSequences.add("()"+permissibleSequencesOfBrackets(num - 1).get(i));
                    listOfSequences.add("("+permissibleSequencesOfBrackets(num - 1).get(i)+")");
                }
            return listOfSequences;
        }
        return null;
    }
}
