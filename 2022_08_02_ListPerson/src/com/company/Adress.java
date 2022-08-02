package com.company;

public class Adress {
    private String postcode;
    private String city;
    private String street;
    private String house;

    public Adress(String postcode, String city, String street, String house) {
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getSity() {
        return city;
    }

    public void setSity(String sity) {
        this.city = sity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return " (" + postcode + ", " + city + ", " + street + ", " + house + ") ";
    }
}