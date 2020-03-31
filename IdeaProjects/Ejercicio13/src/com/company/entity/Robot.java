package com.company.entity;

public class Robot {
    public String numeroDeSerie;
    public int PBT;
    public String traccion;

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public int getPBT() {
        return PBT;
    }

    public void setPBT(int PBT) {
        this.PBT = PBT;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public void createRobot  (String numeroDeSerie, int PBT, String traccion){
       setNumeroDeSerie(numeroDeSerie);
       setPBT(PBT);
       setTraccion(traccion);
    }
}
