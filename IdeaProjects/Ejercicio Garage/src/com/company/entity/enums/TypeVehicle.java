package com.company.entity.enums;

public enum TypeVehicle {

    MOTORCYCLE("MOTORCYCLE"), CAR("CAR"), BICYCLE("BICYCLE"), VAN("VAN");

    private String typeVehicle;

    TypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }
}
