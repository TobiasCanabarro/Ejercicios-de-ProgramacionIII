package com.company.entity.car;

import com.company.entity.aircondition.AirCondition;
import com.company.entity.mp3.Mp3;

public abstract class Car {

    private AirCondition airCondition;
    private Mp3 mp3;
    private boolean largeTrunk;
    private boolean luggage;

    public AirCondition getAirCondition() {
        return airCondition;
    }

    public void setAirCondition(AirCondition airCondition) {
        this.airCondition = airCondition;
    }

    public Mp3 getMp3() {
        return mp3;
    }

    public void setMp3(Mp3 mp3) {
        this.mp3 = mp3;
    }

    public boolean isLargeTrunk() {
        return largeTrunk;
    }

    public void setLargeTrunk(boolean largeTrunk) {
        this.largeTrunk = largeTrunk;
    }

    public boolean isLuggage() {
        return luggage;
    }

    public void setLuggage(boolean luggage) {
        this.luggage = luggage;
    }

    public String feature (){
        return getAirCondition().features()  + " " + getMp3().feature() + " Large trunk : " + isLargeTrunk() + "Luggage : " + isLuggage();
    }
}
