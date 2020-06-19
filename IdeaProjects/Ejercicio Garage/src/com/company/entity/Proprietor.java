package com.company.entity;

public class Proprietor{

    private String name;
    private int dni;
    private String patent;

    public Proprietor (String name, int dni, String patent){
        setName(name);
        setDni(dni);
        setPatent(patent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }
}
