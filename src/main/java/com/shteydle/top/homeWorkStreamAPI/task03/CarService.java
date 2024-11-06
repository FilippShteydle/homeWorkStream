package com.shteydle.top.homeWorkStreamAPI.task03;

import java.util.List;
import java.util.function.Predicate;

public class CarService {

    private CarRepository carRepository = new CarRepository();

    public void createCar (String brand, int yearProduction, int price, String color, double engineCapacity) {
        carRepository.saveCar(brand, yearProduction, price, color, engineCapacity);
    }

    public void printAllCar() {
        carRepository.getCars().stream().forEach(System.out::println);
    }

    public void showSpecifiedColorCar(String color) {
        carRepository.getCars().stream().filter(car -> {return car.getColor().equals(color);}).forEach(System.out::println);
    }

    public void showSpecifiedEngineCar(double engine) {
        carRepository.getCars().stream().filter(car -> {return car.getEngineCapacity() == engine;}).forEach(System.out::println);
    }

    public void showSpecifiedPrice(int price) {
        carRepository.getCars().stream().filter(car -> {return car.getPrice() > price;}).forEach(System.out::println);
    }

    public void showSpecifiedYearProduction(int year1, int year2) {
        carRepository.getCars().stream().filter(car -> {return car.getYearProduction() >= year1 &&
                car.getYearProduction() <= year2;}).forEach(System.out::println);
    }

}
