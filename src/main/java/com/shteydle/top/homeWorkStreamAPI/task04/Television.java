package com.shteydle.top.homeWorkStreamAPI.task04;

public class Television {

    private String brand;
    private String model;
    private int diagonal;
    private int yearProduction;
    private int price;

    public Television(String brand, String model, int diagonal, int price, int yearProduction) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.model = model;
        this.price = price;
        this.yearProduction = yearProduction;
    }

    public String getBrand() {
        return brand;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getPrice() {
        return price;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    @Override
    public String toString() {
        return "Телевизор: " + brand + " " + model +", диагональ: " + diagonal + ", цена: " + price +
                " рублей, год выпуска: " + yearProduction;
    }
}
