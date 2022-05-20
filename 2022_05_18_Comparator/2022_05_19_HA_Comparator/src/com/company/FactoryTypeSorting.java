package com.company;

public class FactoryTypeSorting {
    public TypeOfSorting getTypeOfSorting(int choice) {
        switch (choice) {
            case 1:
                return new SortingByNameArray();
            case 2:
                return new SortingByRatingArray();
            case 3:
                return new SortingByAbsenceArray();
        }
        return null;
    }

}
