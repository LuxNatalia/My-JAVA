package org.telran.parkingproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.parkingproject.model.Car;
import org.telran.parkingproject.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/cars") //указываем путь к нашим методам localhost:8080/cars
public class CarController {

    @Autowired
    private CarService service;

    //localhost:8080/cars
    @GetMapping
    public List<Car> list(){
        return service.list();

    }
    //localhost:8080/cars/5
    @GetMapping("/{id}")  //переменная с именеи id
    public Car getCar(@PathVariable(name="id") int id){
        return service.getCar(id);

    }

    @PostMapping()  //по какому пути объект будет создаваться //localhost:8080/cars , можно дописать другой путь
    public Car create(@RequestBody Car car){ // переменная, которая передается в теле запроса, типа Кар.
        // приходит джейсон представление (текстовый формат),
        // и библиотека джексон создаст новый объект типа кар и заполнит его пришедшими переменными
        return service.save(car);

    }
    @DeleteMapping("/{id}")
    public Boolean remove(@PathVariable(name="id") int id){

        return service.remove(id);
    }
}
