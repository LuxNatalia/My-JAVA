package com.company;
/*Imagine in our program we process an array (for example, an array of integers, or an array of Employee if you want).
In production environment we read this array from User (use Scanner), in test environment we get it as random array or
use an array defined in the code. So, you need to implement a method getArray() witch as argument takes the way,
how the array will be created and as a result returns the array. Implement this program
(hint: use knowledge about interface)*/


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int typeArrayCreation;

        do {
            System.out.println(" enter array creation method: ");
            System.out.println("1 - use Scanner; 2 - random; 3 - defined in the code");
            typeArrayCreation = scanner.nextInt();
        } while (typeArrayCreation<1 || typeArrayCreation>3);

        arrayFactory factory = new arrayFactory();
        getArray myArr = factory.getEmptyArray(typeArrayCreation);
        System.out.println("Array : " + Arrays.toString(myArr.getNewArray()));
    }
}
