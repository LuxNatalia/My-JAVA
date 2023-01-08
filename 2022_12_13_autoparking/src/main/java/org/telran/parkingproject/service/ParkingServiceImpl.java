package org.telran.parkingproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.parkingproject.dao.CarRepository;
import org.telran.parkingproject.dao.ParkingRepository;
import org.telran.parkingproject.model.Car;
import org.telran.parkingproject.model.Parking;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingServiceImpl implements ParkingService{

    @Autowired
    private ParkingRepository parkingRepository;
    @Autowired
    private CarRepository carRepository;


    @Override
    public List<Car> listCarInParking(Parking parking) {
        return parking.getListCarInParking();
    }

    @Override
    public void addCar(Parking parking, int id) {
        parking.getListCarInParking().add(carRepository.getCar(id));

    }

    @Override
    public void removeCar(Parking parking, int id) {
        parking.getListCarInParking().remove(id);
    }
    @Override
    public List<Parking> parkingList() {
        return parkingRepository.parkingList();
    }

    @Override
    public Parking getParking(int id) {
        return parkingRepository.parkingList().stream().filter(parking->parking.getId()==id).findFirst().get();
    }

    @Override
    public Parking saveParking(Parking parking) {
        return parkingRepository.saveParking(parking);
    }

    @Override
    public boolean removeParking(int id) {
            return parkingRepository.removeParking(id);
    }
}
