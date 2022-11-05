package com.company;
/*программа заполняет массив из  1 млн случайных чисел в 2 потока*/
public class Main {

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[1000000];

        Thread t1=new Task1(arr);
        Thread t2=new Task2(arr);
        long start=System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long finish=System.currentTimeMillis();
        System.out.println((finish-start)+" ms ");
       /* for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");*/
    }
}
