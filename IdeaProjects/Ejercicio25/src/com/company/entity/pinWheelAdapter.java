package com.company.entity;

public class pinWheelAdapter implements Adapter{

    private int countIn;
    private int countOut;

    public int getNumberPeopleIn(){
        return countIn;
    }

    public int getNumberPeopleOut(){
        return countOut;
    }

    public int getCountIn() {
        return countIn;
    }

    public void setCountIn(int countIn) {
        this.countIn = countIn;
    }

    public int getCountOut() {
        return countOut;
    }

    public void setCountOut(int countOut) {
        this.countOut = countOut;
    }
}
