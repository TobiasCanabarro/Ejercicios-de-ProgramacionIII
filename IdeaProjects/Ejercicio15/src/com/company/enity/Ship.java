package com.company.enity;

public abstract class Ship {

    private int flotability;
    private int stability;
    private int speed;
    private String name;
    private int engine;

    public int getFlotability() {
        return flotability;
    }

    public void setFlotability(int flotability) {
        this.flotability = flotability;
    }

    public int getStability() {
        return stability;
    }

    public void setStability(int stability) {
        this.stability = stability;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getInfo (){
        return "Flotability : " + getFlotability() + " Stability : " + getStability() + " Speed : " + getSpeed() + " Name : " +
                getName() + " Engine : " + getEngine() + " ";
    }
}
