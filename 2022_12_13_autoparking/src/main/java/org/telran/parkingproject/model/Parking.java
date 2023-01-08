package org.telran.parkingproject.model;

import java.util.List;

public class Parking {
    private String name;
    private int id;
    private List<Car> listCarInParking;

    public Parking(String name, int id) {
        this.name = name;
        this.id = id;
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

    public List<Car> getListCarInParking() {
        return listCarInParking;
    }

    public void setListCarInParking() {
        this.listCarInParking = listCarInParking;
    }
}
