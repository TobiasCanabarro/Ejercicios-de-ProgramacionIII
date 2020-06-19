package com.company.entity;

import com.company.entity.enums.TypeVehicle;

public class Vehicle {

    private final static int ID_BASE = 0;
    private Proprietor proprietor;
    private int id;
    private TypeVehicle typeVehicle;

    public Vehicle(Proprietor proprietor, TypeVehicle typeVehicle){
        setProprietor(proprietor);
        setId(ID_BASE);
        setTypeVehicle(typeVehicle);
    }

    public Proprietor getProprietor() {
        return proprietor;
    }

    public void setProprietor(Proprietor proprietor) {
        this.proprietor = proprietor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeVehicle getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(TypeVehicle typeVehicle) {
        this.typeVehicle = typeVehicle;
    }
}
