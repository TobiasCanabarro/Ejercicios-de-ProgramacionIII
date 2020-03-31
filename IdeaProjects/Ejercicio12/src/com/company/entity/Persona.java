package com.company.entity;

public class Persona {
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void showData() {
        System.out.println(getName() + " " + getLastName());
    }


    public Persona presentarse() {
        Persona NuevaPersona = new Persona();
        NuevaPersona.setName(this.name);
        NuevaPersona.setLastName(this.lastName);

        return NuevaPersona;
    }

}
