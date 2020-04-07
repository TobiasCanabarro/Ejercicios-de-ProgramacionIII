package com.company.enity;

public class Destroyer extends Offensive {
    private int maniobrability;

    public int getManiobrability() {
        return maniobrability;
    }

    public void setManiobrability(int maniobrability) {
        this.maniobrability = maniobrability;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Maniobrability : " + getManiobrability();
    }
}
