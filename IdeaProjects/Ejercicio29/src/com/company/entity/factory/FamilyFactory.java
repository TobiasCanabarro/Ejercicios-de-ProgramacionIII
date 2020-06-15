package com.company.entity.factory;

import com.company.entity.car.Family;

public class FamilyFactory extends Factory{

   public Family create (){
       return new Family();
   }
}
