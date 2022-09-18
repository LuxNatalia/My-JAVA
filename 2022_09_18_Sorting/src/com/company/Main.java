package com.company;

import java.util.Arrays;

public class Main {
    //Сортировкка слиянием; сортировка пузырьком; быстрая сортировка
    public static void main(String[] args) {
        int[] arr = {2, 7, 12, 55, 86, 2, 39, 41, 5, 100, 94, 53, 25, 0, 79, 3, 81, 82, 83, 90, 34, 15, 60};
        int[] arr1 = {2, 7, 12, 55, 86, 2, 39, 41, 5, 100, 94, 53, 25, 0, 79, 3, 81, 82, 83, 90, 34, 15, 60};
        int[] arr3 = {2, 7, 12, 55, 86, 2, 39, 41, 5, 100, 94, 53, 25, 0, 79, 3, 81, 82, 83, 90, 34, 15, 60};

        System.out.println("_______________bubblesort______________");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSorting(arr)));
        System.out.println("_______________mergesort_______________");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(mergeSort(arr1, 0, arr1.length)));
        System.out.println("_______________quicksort______________");
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(quickSort(arr3, 0, arr3.length)));


    }

    //метод merge без использования дополнительных массивов
    public static int[] merge(int[] arr, int start1, int start2, int end) {
        int i1 = start1;
        int i2 = start2;
        int temp;
        int j;
        while (i1 < start2 && i2 < end && start2 < end) {
            if (arr[i1] > arr[i2]) {
                temp = arr[i2];
                j = i2;
                while (j > i1) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[i1] = temp;
                start2++;
                i1++;
                i2++;
            } else {
                i1++;

            }
        }
        return arr;
    }

    public static int[] mergeSort(int[] arr, int start, int end) {
        int length = end - start;
        if (length <= 1) return arr;
        mergeSort(arr, start, start + length / 2);
        mergeSort(arr, start + length / 2, end);
        merge(arr, start, start + length / 2, end);
        return arr;
    }

    public static int[] bubbleSorting(int[] arr) {
        int temp;
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count++;
                }
            }
        }
        return arr;
    }

    public static void shiftToTheLeft(int[] arr, int num, int support) {
        int temp = arr[num];
        for (int i = num; i < support; i++) {
            arr[i] = arr[i + 1];
        }
        arr[support] = temp;
    }


    public static void shiftToTheRight(int[] arr, int num, int support) {
        int temp = arr[num];
        for (int i = num; i > support; i--) {
            arr[i] = arr[i - 1];
        }
        arr[support] = temp;
    }

    public static int[] quickSort(int[] arr, int start, int end) {
        int length = end - start;
        if (length <= 1) return arr;
        int support = start + length / 2;

        for (int i = start; i < support; i++) {
            if (start < support) {
                if (arr[i] > arr[support]) {
                    shiftToTheLeft(arr, i, support);
                    i = i - 1;
                    support--;
                }
            }
        }

        for (int i = support + 1; i < end; i++) {
            if (support < end) {
                if (arr[i] < arr[support]) {
                    shiftToTheRight(arr, i, support);
                    support++;
                }
            }
        }
        quickSort(arr, start, support);
        quickSort(arr, support, end);
        return arr;
    }


}
