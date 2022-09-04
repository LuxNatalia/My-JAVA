package com.company;

public class Main {

    public static void main(String[] args) {
	int num=3;
        System.out.println("Fibonacci number №" + num + " is "+ fibonacciNumber(num));
    }


    public static int fibonacciNumber(int num){
             int res=1;
        if (num>2) {
            res = fibonacciNumber(num - 1) + fibonacciNumber(num - 2);
        }
        return res;
    }
}
