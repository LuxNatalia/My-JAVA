package org.telran.parkingproject.dao;

import org.telran.parkingproject.model.Car;
import org.telran.parkingproject.model.Parking;

import java.util.List;

public interface ParkingRepository {
    List<Parking> parkingList();
    Parking getParking(int id);
    Parking saveParking(Parking parking);
    boolean removeParking(int id);

}
