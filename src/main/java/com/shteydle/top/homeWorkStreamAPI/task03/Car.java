package com.shteydle.top.homeWorkStreamAPI.task03;

public class Car {
    private String brand;
    private int yearProduction;
    private int price;
    private String color;
    private double engineCapacity;

    public Car(String brand, int yearProduction, int price, String color, double engineCapacity) {
        this.brand = brand;
        this.yearProduction = yearProduction;
        this.price = price;
        this.color = color;
        this.engineCapacity = engineCapacity;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Автомобиль: " + brand + ", год выпуска: " + yearProduction +
                ", цена: " + price + " рублей, цвет: " + color + ", объем двигателя: " + engineCapacity;
    }
}
