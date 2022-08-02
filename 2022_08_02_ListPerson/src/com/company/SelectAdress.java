package com.company;

public class SelectAdress implements SelectItem{
    @Override
    public String select(Person person) {
        return person.getAdress().toString();
    }
}
