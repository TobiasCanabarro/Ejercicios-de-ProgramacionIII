package com.company.entity;

public abstract class Family {

    private String name;
    private String lastName;
    private int birthdayAge;
    private String id;

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

    public int getBirthdayAge() {
        return birthdayAge;
    }

    public void setBirthdayAge(int birthdayAge) {
        this.birthdayAge = birthdayAge;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void add (Family family);

    public abstract Family search (String id);

    public abstract String identification ();
}
