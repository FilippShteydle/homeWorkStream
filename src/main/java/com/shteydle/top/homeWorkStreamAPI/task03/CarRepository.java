package com.shteydle.top.homeWorkStreamAPI.task03;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private static List<Car> cars = new ArrayList<>();

    public void saveCar(String brand, int yearProduction, int price, String color, double engineCapacity) {
        cars.add(new Car(brand, yearProduction, price, color, engineCapacity));
    }

    public List<Car> getCars() {
        return cars;
    }

}
