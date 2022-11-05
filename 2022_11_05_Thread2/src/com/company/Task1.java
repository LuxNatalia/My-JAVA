package com.company;

import java.util.Random;

public class Task1 extends Thread {
    int[] arr;


    public Task1(int[] arr) {
        this.arr = arr;
    }

    public void run(){
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i=i+2) {
            arr[i]= rnd.nextInt(10000);
            // System.out.println(this.getName()+" "+arr[i]+ " ");
        }


    }

}