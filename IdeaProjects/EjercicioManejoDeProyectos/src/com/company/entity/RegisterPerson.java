package com.company.entity;

public class RegisterPerson extends Person {

    private int hoursWorked;

    public RegisterPerson(Person person, int hoursWorked) {
        super(person.getName());
        setHoursWorked(hoursWorked);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String feature () {
        return "Nombre : " + getName() + " Horas trabajadas : " + getHoursWorked() + " ID Proyecto : " + getIdProject();
    }
}
