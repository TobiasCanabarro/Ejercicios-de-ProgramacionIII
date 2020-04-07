package com.company.enity;

public class Boat extends Ship {
    public int maniobrability;
    public int crank;

    public int getManiobrability() {
        return maniobrability;
    }

    public void setManiobrability(int maniobrability) {
        this.maniobrability = maniobrability;
    }

    public int getCrank() {
        return crank;
    }

    public void setCrank(int crank) {
        this.crank = crank;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Maniobrability : " + getManiobrability() + " Crank : " + getCrank();
    }
}
