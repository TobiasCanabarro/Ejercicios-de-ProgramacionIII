package edu.utn.entity;

import java.awt.*;

public class Vehiculo {
    public String brand;
    public String model;
    private String patent;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public void showCar (){
        System.out.println("Brand : " + getBrand());
        System.out.println("Model : " + getModel());
    }
}
