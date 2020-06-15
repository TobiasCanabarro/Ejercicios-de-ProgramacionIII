package com.company.entity.car;

import com.company.entity.aircondition.NationalAirCondition;
import com.company.entity.factory.Factory;
import com.company.entity.mp3.NationalMp3;

public class Family extends Car{

    public Family (){
        setAirCondition(new NationalAirCondition());
        setLargeTrunk(true);
        setLuggage(true);
        setMp3(new NationalMp3());
    }
}
