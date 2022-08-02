package com.company;

public class Person {
    private String fName;
    private String lName;
    private String email;
    private String phone;
    private Adress adress;

    public Person(String fName, String lName, String email, String phone, Adress adress) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return " {" + fName + " " + lName + ", " + email + ", " + phone + ", " + adress.toString() +"} ";
    }
}
