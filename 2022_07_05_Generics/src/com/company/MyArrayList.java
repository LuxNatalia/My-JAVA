package com.company;


import java.util.Arrays;

public class MyArrayList<T> {
    // private T value;
    private int curIndex = 0;
    private int capacity = 2;
    private Object[] myArray = new Object[capacity];

    public MyArrayList() {

        this.myArray = myArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(myArray) + " Length of Array is " + curIndex + " ";

    }

    private void increaseToSize(int size) {
        if (size > capacity) {
            Object[] temp = new Object[size];
            for (int i = 0; i < curIndex; i++) {
                temp[i] = myArray[i];
            }
            capacity = size;
            myArray = temp;
        }
    }

    public void add(Object t) {
        myArray[curIndex++] = t;
        if (curIndex == capacity) {
            increaseToSize(capacity * 2);
        }

    }

    public T get(int index) {
        return (T) myArray[index];
    }

    public int size() {
        return curIndex;
    }
}

