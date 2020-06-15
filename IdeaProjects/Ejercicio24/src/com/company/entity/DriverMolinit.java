package com.company.entity;

public class DriverMolinit {

    private int countIn;
    private int countOut;

    public DriverMolinit (){
        setCountIn(5);
        setCountOut(5);
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
