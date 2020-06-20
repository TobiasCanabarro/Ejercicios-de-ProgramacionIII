package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<RegisterPerson> registeredPeople;

    public List<RegisterPerson> getRegisteredPeople() {
        return registeredPeople;
    }

    public void setRegisteredPeople(List<RegisterPerson> registeredPeople) {
        this.registeredPeople = registeredPeople;
    }

    public void add (RegisterPerson registerPerson) {
        if(registeredPeople == null){
            registeredPeople = new ArrayList<>();
        }
        registeredPeople.add(registerPerson);
    }

}
