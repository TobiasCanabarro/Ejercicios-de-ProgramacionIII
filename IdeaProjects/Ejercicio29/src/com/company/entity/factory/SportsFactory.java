package com.company.entity.factory;

import com.company.entity.car.Sports;

public class SportsFactory extends Factory{

    public Sports create (){
        return new Sports();
    }
}
