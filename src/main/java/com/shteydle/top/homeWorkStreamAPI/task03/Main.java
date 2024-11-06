package com.shteydle.top.homeWorkStreamAPI.task03;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();

        carService.createCar("Вольво", 2005, 2000000, "Белый", 1.8);
        carService.createCar("Ауди", 2010, 2500000, "Черный", 2.5);
        carService.createCar("Мерседес", 2012, 4000000, "Красный", 2.5);
        carService.createCar("Вольво", 2014, 3000000, "Белый", 1.8);
        carService.createCar("Лада", 2020, 1500000, "Черный", 1.6);

        //carService.printAllCar();

        carService.showSpecifiedColorCar("Белый");
        System.out.println("-------------------------");
        carService.showSpecifiedEngineCar(2.5);
        System.out.println("-------------------------");
        carService.showSpecifiedPrice(2500000);
        System.out.println("-------------------------");
        carService.showSpecifiedYearProduction(2012, 2020);

    }
}
