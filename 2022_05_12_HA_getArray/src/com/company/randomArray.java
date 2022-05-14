package com.company;

import java.util.Random;
import java.util.Scanner;

public class randomArray implements getArray{
    @Override
    public int[] getNewArray() {

        int arraysLength = (int) (Math.random() * (20));

        int[] newArray = new int[arraysLength];

        for (int i = 0; i < arraysLength; i++) {
          /*  Random random= new Random(System.currentTimeMillis());
        newArray[i] = random.nextInt();
        ПОЧЕМУ ???  на выходе получился такой массив : [309901133, 309901133, 309901133] ???
        }*/
            newArray[i] = (int) (Math.random() * (1000));
        }
        return newArray;
    }
}
