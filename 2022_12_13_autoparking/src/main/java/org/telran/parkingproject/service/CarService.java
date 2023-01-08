package org.telran.parkingproject.service;

//CRUD - create, read, update, delete

// 1. list all cars
// 2. get one car
// 3. create new  cars
// 4. Update car
// 5. Delete car

import org.telran.parkingproject.model.Car;

import java.util.List;

public interface CarService {
    List<Car> list();
    Car getCar(int id);
    Car save(Car car);
    Car update(Car car);
    boolean remove(int id);

}
