package com.company;

public class SelectPhone implements SelectItem{
    @Override
    public String select(Person person) {
        return person.getPhone();
    }
}
