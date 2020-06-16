package com.company.enums;

public enum Size {
    RANDE("RANDE"), PICHITITO("PICHITITO"), NIRANIPI("NIRANIPI");

    private String size;

    Size(String size){
        setSize(size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
