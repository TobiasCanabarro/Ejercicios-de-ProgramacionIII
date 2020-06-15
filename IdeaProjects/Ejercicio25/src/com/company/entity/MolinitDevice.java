package com.company.entity;

public class MolinitDevice implements Adapter {

    private DriverMolinit driver;

    public MolinitDevice(DriverMolinit driver){
        this.driver = driver;
    }

    public int getNumberPeopleIn(){
        return driver.getCountIn();
    }

    public int getNumberPeopleOut(){
        return driver.getCountOut();
    }


}
