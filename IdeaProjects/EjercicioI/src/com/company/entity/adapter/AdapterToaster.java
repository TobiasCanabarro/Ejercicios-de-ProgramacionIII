package com.company.entity.adapter;

import com.company.entity.Toaster;
import com.company.entity.Turnable;

public class AdapterToaster implements Turnable {

    private Toaster driver;

    public AdapterToaster(Toaster driver) {
        this.driver = driver;
    }

    public Toaster getDriver() {
        return driver;
    }

    public void setDriver(Toaster driver) {
        this.driver = driver;
    }

    @Override
    public void turnOn() {
        driver.tuesta();
    }

    @Override
    public void turnOff() {
        driver.noTuesta();
    }
}
