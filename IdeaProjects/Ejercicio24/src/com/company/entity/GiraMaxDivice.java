package com.company.entity;

public class GiraMaxDivice implements Adapter{

    private DriverGiraMax driver;

    public GiraMaxDivice(DriverGiraMax driver) {
        this.driver = driver;
    }


    @Override
    public int getNumberPeopleIn() {
        return driver.getCountIn();
    }

    @Override
    public int getNumberPeopleOut() {
        return driver.getCountOut();
    }
}
