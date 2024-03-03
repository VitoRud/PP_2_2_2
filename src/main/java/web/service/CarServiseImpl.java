package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiseImpl implements CarService{
    @Override
    public List<Car> returnCars(List<Car> list, int value) {
        return list.stream().limit(value).collect(Collectors.toList());
    }

}
