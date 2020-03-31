package edu.utn.entity;

public class Guardia {
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

    public void showDatumGuardia (){
        System.out.println(getName()+ " " + getLastName());
    }
}
