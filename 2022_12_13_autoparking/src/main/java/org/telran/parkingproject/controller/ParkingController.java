package org.telran.parkingproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.parkingproject.dao.ParkingRepository;
import org.telran.parkingproject.model.Car;
import org.telran.parkingproject.model.Parking;
import org.telran.parkingproject.service.CarService;
import org.telran.parkingproject.service.ParkingService;

import java.util.List;

@RestController
@RequestMapping("/parkings")
public class ParkingController {
    @Autowired
    private ParkingService parkingService;

    //localhost:8080/parkings
    @GetMapping
    public List<Car> listCarInParking(Parking parking){
        return parkingService.listCarInParking(parking);
    }

    @PostMapping()
    public void addCar(@RequestBody Parking parking, @RequestBody Car car){
        parking.getListCarInParking().add(car);
    }
    @DeleteMapping("/{id}")
    public void removeCar(@PathVariable Parking parking, @PathVariable(name="id") int id){
     parking.getListCarInParking().remove(id);
    }
    @GetMapping
    public List<Parking> list(){
        return parkingService.parkingList();

    }
    @GetMapping("/{id}")
    public Parking getParking(@PathVariable(name="id") int id){
        return parkingService.getParking(id);

    }

    @PostMapping()
    public Parking create(@RequestBody Parking parking){
        return parkingService.saveParking(parking);

    }
    @DeleteMapping("/{id}")
    public Boolean remove(@PathVariable(name="id") int id){

        return parkingService.removeParking(id);
    }
}
