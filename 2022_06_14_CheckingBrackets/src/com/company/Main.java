package com.company;

public class Main {

    public static void main(String[] args) {

        String string1 = "1+99(6+9)-[54*9]";

        System.out.println(string1);

        System.out.println(CheckingBrackets.checkingBrackets(string1));
    }
}
