package com.shteydle.top.homeWorkStreamAPI.task04;

public class Main {
    public static void main(String[] args) {
        TelevisionService tvService = new TelevisionService();

        tvService.createTV("LG", "Y102", 27, 30000, 2024);
        tvService.createTV("Sony", "red15", 41, 70000, 2023);
        tvService.createTV("LG", "G254", 80, 150000, 2024);
        tvService.createTV("Xiaomy", "tyugh", 21, 14000, 2022);
        tvService.createTV("Sony", "blue305", 27, 33000, 2024);
        tvService.createTV("Xiaomy", "adeg", 33, 47000, 2021);
        tvService.createTV("LG", "q258", 101, 1000000, 2024);
        tvService.createTV("Sony", "Green368", 84, 750000, 2024);

        //tvService.showAllTV();

        tvService.showSpecifiedDiagonal(27);
        System.out.println("----------------");
        tvService.showTVThisYear();
        System.out.println("----------------");
        tvService.showSpecifiedPrice(60000);
        System.out.println("----------------");
        tvService.showAskPrice();
        System.out.println("----------------");
        tvService.showDescPrice();
        System.out.println("----------------");
        tvService.showAskDiagonal();
        System.out.println("----------------");
        tvService.showDescDiagonal();
    }
}
