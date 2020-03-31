package com.company.entity;

public class Oruga extends Robot{
    private int temp;
    private int kmPerHs;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getKmPerHs() {
        return kmPerHs;
    }

    public void setKmPerHs(int kmPerHs) {
        this.kmPerHs = kmPerHs;
    }

    public Oruga (String numeroDeSerie, int PBT){
        setNumeroDeSerie(numeroDeSerie);
        setPBT(PBT);
    }


    public void processTraccion (){
        this.PBT -= 3;
        this.temp = 70;
        this.kmPerHs = 400;
    }

    public void showData(){
        System.out.println("Temp : " + getTemp());
        System.out.println("Km/h : " + getKmPerHs());
    }
}
