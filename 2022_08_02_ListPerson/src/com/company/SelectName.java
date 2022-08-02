package com.company;

public class SelectName implements SelectItem{
    @Override
    public String select(Person person) {
        return person.getfName()+" "+ person.getlName();
    }
}
