package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("VAZ", "2110", 1999));
        carsList.add(new Car("UAZ", "Patriot", 2011));
        carsList.add(new Car("ZAZ", "Chance", 2007));
        carsList.add(new Car("GAZ", "Vector", 2020));
        carsList.add(new Car("Ford", "Mustang", 1965));
        CarService carService = new CarServiseImpl();
        List<Car> newCarList = carService.returnCars(carsList,count);
        model.addAttribute("newCarList", newCarList);
        return "car";
    }
}
