package com.company.entity.manager.cashing;

public abstract class Cashing {

    private int amountHour;
    private int amountPlus;

    public int getAmountHour() {
        return amountHour;
    }

    public void setAmountHour(int amountHour) {
        this.amountHour = amountHour;
    }

    public int getAmountPlus() {
        return amountPlus;
    }

    public void setAmountPlus(int amountPlus) {
        this.amountPlus = amountPlus;
    }
}
