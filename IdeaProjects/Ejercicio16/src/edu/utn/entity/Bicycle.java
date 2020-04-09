package edu.utn.entity;

public class Bicycle extends Item{
    private int rodade;
    private boolean electric;
    private int gears;

    public Bicycle(String description) {
        super(description);
    }

    public int getRodade() {
        return rodade;
    }

    public void setRodade(int rodade) {
        this.rodade = rodade;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
}
