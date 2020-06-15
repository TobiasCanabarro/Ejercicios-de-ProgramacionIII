package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class Parent extends Family{

    private List<Family> parents;

    public Parent(String name, String lastName, int birthdayAge) {
        setName(name);
        setLastName(lastName);
        setBirthdayAge(birthdayAge);
        setId();
    }

    private String generateId (){
        String id = String.valueOf( (getBirthdayAge() % 100) ); //1940 -> 40
        id += String.valueOf(getName().charAt(0));//40t
        id += String.valueOf(getLastName().charAt(0));//40tc
        return id;
    }

    public void setId(){
        setId(generateId());
    }

    @Override
    public void add(Family family) {
        if(parents == null){
            parents = new ArrayList<>();
        }
        parents.add(family);
    }

    @Override
    public Family search(String id) {
        Family family = null;
        if(getId().equals(id)){
            family = this;
        }
        else if(parents != null){
            for(int i = 0; i < parents.size() && family == null; ++i){
                family = parents.get(i).search(id);
            }
        }
        return family;
    }

    @Override
    public String identification() {
        return "Name : " + getName() + " Last name : " + getLastName() + " Birthday Age : " + getBirthdayAge() + " ID : " + getId();
    }
}
