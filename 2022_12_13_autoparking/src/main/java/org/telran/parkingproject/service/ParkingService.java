package org.telran.parkingproject.service;

import org.telran.parkingproject.model.Car;
import org.telran.parkingproject.model.Parking;

import java.util.List;

public interface ParkingService {

    List<Car> listCarInParking(Parking parking);

    void addCar(Parking parking, int id);

    void removeCar(Parking parking, int id);

    List<Parking> parkingList();

    Parking getParking(int id);

    Parking saveParking(Parking parking);

    boolean removeParking(int id);
}
