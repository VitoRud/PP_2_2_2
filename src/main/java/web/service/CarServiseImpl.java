package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiseImpl implements CarService{
    @Override
    public List<Car> returnCars(int value) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("VAZ", "2110", 1999));
        carsList.add(new Car("UAZ", "Patriot", 2011));
        carsList.add(new Car("ZAZ", "Chance", 2007));
        carsList.add(new Car("GAZ", "Vector", 2020));
        carsList.add(new Car("Ford", "Mustang", 1965));
        return carsList.stream().limit(value).collect(Collectors.toList());
    }

}
