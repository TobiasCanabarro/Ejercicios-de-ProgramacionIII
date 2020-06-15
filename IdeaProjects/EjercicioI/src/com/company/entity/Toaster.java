package com.company.entity;

public class Toaster {
    private String model;
    private boolean on;

    public Toaster(String model) {
        setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void tuesta (){
        setOn(true);
        System.out.println("Se encendio " + getModel());
    }

    public void noTuesta (){
        setOn(false);
        System.out.println("Se apago " + getModel());
    }
}
