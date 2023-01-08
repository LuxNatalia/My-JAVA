package org.telran.parkingproject.dao;

import org.springframework.stereotype.Component;
import org.telran.parkingproject.model.Car;
import org.telran.parkingproject.model.Parking;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Component
public class ParkingRepositoryImpl implements ParkingRepository{
    private List<Parking> parkingList=new ArrayList<>();
    private AtomicInteger parkingId= new AtomicInteger(3);

    @PostConstruct
    private void init(){

       parkingList.add(new Parking("Parking 1", 1));
    }


    @Override
    public List<Parking> parkingList() {
        return parkingList;
    }

    @Override
    public Parking getParking(int id) {
        return parkingList.stream().filter(parking->parking.getId()==id).findFirst().get();
    }

    @Override
    public Parking saveParking(Parking parking) {
        parking.setId(parkingId.incrementAndGet());
        parkingList.add(parking);
        return parking;
    }

    @Override
    public boolean removeParking(int id) {
        parkingList=parkingList.stream().filter(parking->parking.getId() !=id).collect(Collectors.toList());
        return true;
    }
}
