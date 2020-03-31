package edu.utn.entity;

public class Car {

    private  int doors;
    private float fuelTankCap;
    private  String color; // alt + enter o alt + insert
    private Choffer driver; // this.

    public  Car (Choffer driver){ // Constructor
        this.driver = driver;
    }

    public  Car (){ // Constructor

    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public float getFuelTankCap() {
        return fuelTankCap;
    }

    public void setFuelTankCap(float fuelTankCap) {
        this.fuelTankCap = fuelTankCap;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  void printDriverName (){
        System.out.println(driver.getName());
    }
}
