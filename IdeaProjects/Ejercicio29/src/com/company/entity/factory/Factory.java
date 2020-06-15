package com.company.entity.factory;

import com.company.entity.car.Car;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    private void add (Car car){
        if(cars == null){
            cars = new ArrayList<>();
        }
        cars.add(car);
    }

    private Car createFamilyCar(){
        return new FamilyFactory().create();
    }

    private Car createSpotsCar (){
        return new SportsFactory().create();
    }

    public List<Car> createCars (int cantCarsCreate){

        for(int i = 0; i < cantCarsCreate; ++i){
            if(i%2 == 0){
               add(createFamilyCar());
            }
            else{
                add(createSpotsCar());
            }
        }
        return getCars();

    }

    public void showCarsCreated(){
        for(Car car : getCars()){
            System.out.println(car.feature());
        }
    }
}
