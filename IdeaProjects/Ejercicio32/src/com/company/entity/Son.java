package com.company.entity;

public class Son extends Family{

    public Son(String name, String lastName, int birthdayAge) {
        setName(name);
        setLastName(lastName);
        setBirthdayAge(birthdayAge);
    }

    @Override
    public void add(Family family) {

    }

    @Override
    public Family search(String id) {
        return null;
    }

    @Override
    public String identification() {
        return null;
    }
}
