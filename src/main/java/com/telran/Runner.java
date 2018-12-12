package com.telran;

import com.telran.model.entity.Car;
import com.telran.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Runner implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("RUN WORKS!");
        Car seat = new Car();
        seat.setBrand("Seat");
        seat.setModel("Leon");

        System.out.println("Car before save: " + seat.toString());
        carRepository.save(seat);
        //seat.setId(...)
        System.out.println("Car after save: " + seat.toString());

//        seat.setId(null);
        seat.setBrand("Ibiza");
        carRepository.save(seat);
        System.out.println(seat);
    }
}
