package com.company.entity.adapter;

import com.company.entity.Motocycle;
import com.company.entity.Turnable;

public class AdapterMotocycle implements Turnable {
    private Motocycle driver;

    public AdapterMotocycle(Motocycle driver) {
        this.driver = driver;
    }

    @Override
    public void turnOn() {
        driver.burrm();
    }

    @Override
    public void turnOff() {
        driver.noBurrm();
    }
}
