package com.company.entity;

public class PersonIdentity extends Person{

    private int dni;
    private int antiquity;
    private float netSalary;

    public PersonIdentity (int dni, int antiquity, float netSalary){
        setDni(dni);
        setAntiquity(antiquity);
        setNetSalary(netSalary);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAntiquity() {
        return antiquity;
    }

    public void setAntiquity(int antiquity) {
        this.antiquity = antiquity;
    }

    public float getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(float netSalary) {
        this.netSalary = netSalary;
    }
}
