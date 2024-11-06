package com.shteydle.top.homeWorkStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Task01 {

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(0, 10));
        }

        System.out.println(numbers);
        System.out.println(evenNumbersCount(numbers));
        System.out.println(oddNumbersCount(numbers));
        System.out.println(nullCount(numbers));
        System.out.println(specifiedNumberCount(numbers, 5));

    }
    public static int evenNumbersCount(List<Integer> numbers) {
        return (int) numbers.stream().filter(integer -> {return integer % 2 == 0;}).count();
    }

    public static int oddNumbersCount(List<Integer> numbers) {
        return (int) numbers.stream().filter(integer -> {return integer % 2 != 0;}).count();
    }

    public static int nullCount(List<Integer> numbers) {
        return (int) numbers.stream().filter(integer -> {return integer == 0;}).count();
    }

    public static int specifiedNumberCount(List<Integer> numbers, int num) {
        return (int) numbers.stream().filter(integer -> {return integer == num;}).count();
    }
}
