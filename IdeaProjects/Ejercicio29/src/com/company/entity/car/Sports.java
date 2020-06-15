package com.company.entity.car;

import com.company.entity.aircondition.ImportedAirCondition;
import com.company.entity.mp3.ImportedMp3;

public class Sports extends Car{

    public Sports() {
        setAirCondition(new ImportedAirCondition());
        setLargeTrunk(false);
        setLuggage(false);
        setMp3(new ImportedMp3());
    }
}
