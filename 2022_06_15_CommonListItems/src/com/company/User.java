package com.company;

import java.util.Objects;

public class User {
    String name;
    int id;
    String pfoneNumber;
    String location;

    public User(String name, int id, String pfoneNumber, String location) {
        this.name = name;
        this.id = id;
        this.pfoneNumber = pfoneNumber;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPfoneNumber() {
        return pfoneNumber;
    }

    public void setPfoneNumber(String pfoneNumber) {
        this.pfoneNumber = pfoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return name + '\'' + id  + '\'' + location +'\''+ pfoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId() == user.getId() && Objects.equals(getName(), user.getName()) && Objects.equals(getPfoneNumber(), user.getPfoneNumber()) && Objects.equals(getLocation(), user.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getPfoneNumber(), getLocation());
    }
}
