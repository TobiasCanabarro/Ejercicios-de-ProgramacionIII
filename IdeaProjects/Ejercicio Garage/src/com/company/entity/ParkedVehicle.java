package com.company.entity;

import com.company.entity.enums.TypeGarage;
import com.company.entity.manager.cashing.Cashing;

public class ParkedVehicle extends Vehicle{

    private TypeGarage typeGarage;
    private Cashing cashing;

    public ParkedVehicle (Vehicle vehicle, TypeGarage typeGarage, Cashing cost){
        super(vehicle.getProprietor(), vehicle.getTypeVehicle());
        setProprietor(vehicle.getProprietor());
        setId(vehicle.getId());
        setTypeGarage(typeGarage);
        setTypeVehicle(vehicle.getTypeVehicle());
        setCashing(cost);
    }

    public TypeGarage getTypeGarage() {
        return typeGarage;
    }

    public void setTypeGarage(TypeGarage typeGarage) {
        this.typeGarage = typeGarage;
    }

    public Cashing getCashing() {
        return cashing;
    }

    public void setCashing(Cashing cashing) {
        this.cashing = cashing;
    }
}
