package com.company;

import java.util.Random;

public class Task2 extends Thread {
    int[] arr;

    public Task2(int[] arr) {
        this.arr = arr;
    }

    public void run(){
        Random rnd = new Random();
        for (int i = 1; i < arr.length; i=i+2) {
            arr[i]= rnd.nextInt(10000);
            // System.out.println(this.getName()+" "+arr[i]+ " ");
        }


    }

}
