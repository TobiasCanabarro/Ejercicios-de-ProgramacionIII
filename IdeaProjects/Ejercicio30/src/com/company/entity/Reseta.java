package com.company.entity;

public class Reseta {

    private int cant;
    private String ingredientType;
    private String measurementUnit;

    public Reseta(int cant, String ingredientType, String measurementUnit) {
        setCant(cant);
        setIngredientType(ingredientType);
        setMeasurementUnit(measurementUnit);
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getIngredientType() {
        return ingredientType;
    }

    public void setIngredientType(String ingredientType) {
        this.ingredientType = ingredientType;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }


}
