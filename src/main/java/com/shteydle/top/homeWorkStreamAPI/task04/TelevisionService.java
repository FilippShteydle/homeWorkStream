package com.shteydle.top.homeWorkStreamAPI.task04;

import java.time.Year;
import java.util.Comparator;

public class TelevisionService {
    private TelevisionRepository tvRepository = new TelevisionRepository();

    public void createTV(String brand, String model, int diagonal, int price, int yearProduction) {
        tvRepository.saveTelevision(brand, model, diagonal, price, yearProduction);
    }

    public void showAllTV() {
        tvRepository.getTV().stream().forEach(System.out::println);
    }

    public void showSpecifiedDiagonal(int diagonal) {
        tvRepository.getTV().stream().filter(tv -> {return tv.getDiagonal() == diagonal;}).forEach(System.out::println);
    }

    public void showSpecifiedBrand(String brand) {
        tvRepository.getTV().stream().filter(tv -> {return tv.getBrand().equals(brand);}).forEach(System.out::println);
    }

    public void showTVThisYear() {
        tvRepository.getTV().stream().filter(tv -> {return tv.getYearProduction() == Year.now().getValue();}).forEach(System.out::println);
    }

    public void showSpecifiedPrice(int price) {
        tvRepository.getTV().stream().filter(tv -> {return tv.getPrice() > price;}).forEach(System.out::println);
    }

    public void showAskPrice() {
        tvRepository.getTV().stream().sorted((tv1, tv2) -> {return tv1.getPrice() - tv2.getPrice();}).forEach(System.out::println);
    }

    public void showDescPrice() {
        tvRepository.getTV().stream().sorted((tv1, tv2) -> {return tv2.getPrice() - tv1.getPrice();}).forEach(System.out::println);
    }
    public void showAskDiagonal() {
        tvRepository.getTV().stream().sorted(Comparator.comparingInt(Television::getDiagonal)).forEach(System.out::println);
    }

    public void showDescDiagonal() {
        tvRepository.getTV().stream().sorted(Comparator.comparingInt(Television::getDiagonal).reversed()).forEach(System.out::println);
    }
}
