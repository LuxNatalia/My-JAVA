package com.company;

public class arrayFactory {

    public getArray getEmptyArray(int choice) {
        switch (choice) {
            case 1:
                return new useScanner();
            case 2:
                return new randomArray();
            case 3:
                return new definedArray();
        }
        return null;
    }
}