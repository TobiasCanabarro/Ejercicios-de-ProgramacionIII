package com.company.entity;

public class Ingredient {

    private String name;
    private int quantity;

    public Ingredient(String name, int cant) {
        setName(name);
        setQuantity(cant);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
