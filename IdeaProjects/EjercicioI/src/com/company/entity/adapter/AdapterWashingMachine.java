package com.company.entity.adapter;

import com.company.entity.Turnable;
import com.company.entity.WashingMachine;

public class AdapterWashingMachine implements Turnable {
    private WashingMachine driver;

    public AdapterWashingMachine(WashingMachine driver) {
        this.driver = driver;
    }

    public WashingMachine getDriver() {
        return driver;
    }

    public void setDriver(WashingMachine driver) {
        this.driver = driver;
    }

    @Override
    public void turnOn() {
        driver.enciende();
    }

    @Override
    public void turnOff() {
        driver.apaga();
    }
}
