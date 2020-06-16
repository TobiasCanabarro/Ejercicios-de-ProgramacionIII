package com.company.enums;

public enum FPGender {

    MALE("MALE"), FEMALE("FEMALE");

    private String gender;

    FPGender (String gender){
        setGender(gender);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
