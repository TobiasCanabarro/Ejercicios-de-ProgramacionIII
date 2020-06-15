package com.company.entity;

public class RotativityDevice implements Adapter{

    private RotativityDriver driver;

    public RotativityDevice (RotativityDriver driver){
        this.driver = driver;
    }

    @Override
    public int getNumberPeopleIn() {
        return driver.getUsage()[0];
    }

    @Override
    public int getNumberPeopleOut() {
        return driver.getUsage()[1];
    }
}
