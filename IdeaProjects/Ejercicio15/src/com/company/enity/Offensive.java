package com.company.enity;

public abstract class Offensive extends Ship{
    private int solidity;
    private int firePower;

    public int getSolidity() {
        return solidity;
    }

    public void setSolidity(int solidity) {
        this.solidity = solidity;
    }

    public int getFirePower() {
        return firePower;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Solidity : " + getSolidity() + " Fire Power : " + getFirePower();
    }
}
