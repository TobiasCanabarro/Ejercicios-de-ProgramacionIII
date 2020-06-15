package com.company;

import com.company.entity.factory.Factory;

public class Main {

    private static final int CANT_CAR = 10;

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createCars(CANT_CAR);
        factory.showCarsCreated();
    }
}
