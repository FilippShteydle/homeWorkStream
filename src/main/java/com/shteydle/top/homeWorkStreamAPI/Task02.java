package com.shteydle.top.homeWorkStreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {

        List<String> cities = List.of("Москва", "Новосибирск", "Омск", "Томск", "Новосибирск", "Орск", "Казань", "Кострома", "Петербург");

        //printAllCity(cities);
        printMore6Symbol(cities);
        specifiedCityCount(cities, "Новосибирск");
        printSpecifiedSymbolCity(cities, 'К');
    }

    public static void printAllCity(List<String> cities) {
        cities.stream().forEach(System.out::println);
    }

    public static void printMore6Symbol(List<String> cities) {
        cities.stream().filter(s -> s.length() > 6).forEach(System.out::println);
    }

    public static void specifiedCityCount(List<String> cities, String city) {
        System.out.println(cities.stream().filter(s -> s.equals(city)).count());
    }

    public static void printSpecifiedSymbolCity(List<String> cities, char symbol) {
        cities.stream().filter(s -> s.charAt(0) == symbol).forEach(System.out::println);
    }
}
