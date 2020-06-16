package com.company.entity;

import com.company.entity.grON3.exception.DiviceException;

public abstract class Dron {

    private int id;
    private String observation;
    private int size;
    private String typeObject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTypeObject() {
        return typeObject;
    }

    public void setTypeObject(String typeObject) {
        this.typeObject = typeObject;
    }

    public abstract void printInfo() throws DiviceException;

}
