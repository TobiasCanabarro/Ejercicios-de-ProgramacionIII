package com.company.enity;

public class Hospital extends Ship {
    private int loadingCapacity;

    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Capacity : " + getLoadingCapacity();
    }
}
