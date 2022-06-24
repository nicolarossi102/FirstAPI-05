package co.develhope.First.API5.controllers;

import co.develhope.First.API5.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping("")
    public String getCar(){
        return new CarDTO("audi_r8", "Sport", 100000.00).toString();
    }

    @PostMapping("")
    public void postCar(@Valid @RequestBody CarDTO car, HttpServletResponse response) {
        System.out.println("Posted car:" + car.toString());
        response.setStatus(201);
    }

}
