package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<ParkedVehicle> palacesFixed;
    private List<ParkedVehicle> palacesMobile;

    public Garage (){
        setPalacesFixed(new ArrayList<>());
        setPalacesMobile(new ArrayList<>());
    }

    public List<ParkedVehicle> getPalacesFixed() {
        return palacesFixed;
    }

    public void setPalacesFixed(List<ParkedVehicle> palacesFixed) {
        this.palacesFixed = palacesFixed;
    }

    public List<ParkedVehicle> getPalacesMobile() {
        return palacesMobile;
    }

    public void setPalacesMobile(List<ParkedVehicle> palacesMobile) {
        this.palacesMobile = palacesMobile;
    }

}
