package com.company;

public class SelectEmail implements SelectItem {
    @Override
    public String select(Person person) {
        return person.getEmail();
    }
}
