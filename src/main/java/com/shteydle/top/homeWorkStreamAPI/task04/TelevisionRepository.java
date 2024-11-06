package com.shteydle.top.homeWorkStreamAPI.task04;

import java.util.ArrayList;
import java.util.List;

public class TelevisionRepository {

    private static List<Television> tv = new ArrayList<>();

    public void saveTelevision (String brand, String model, int diagonal, int price, int yearProduction) {
        tv.add(new Television(brand, model, diagonal, price, yearProduction));
    }

    public List<Television> getTV() {
        return tv;
    }
}
