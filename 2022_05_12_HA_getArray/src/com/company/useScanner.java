package com.company;

import java.util.Scanner;

public class useScanner implements getArray {

    @Override
    public int[] getNewArray() {
        Scanner scanner=new Scanner(System.in);
        int arraysLength;
        System.out.println(" enter the length of the array: ");
        arraysLength=scanner.nextInt();
        int intsArray[]= new int[arraysLength];
        for(int i=0; i<arraysLength; i++){
            System.out.println(" enter array element: ");
            intsArray[i]=scanner.nextInt();

        }
        return intsArray;
    }


}
