package com.company;

import com.company.entity.Garage;
import com.company.entity.Proprietor;
import com.company.entity.Vehicle;
import com.company.entity.enums.TypeGarage;
import com.company.entity.enums.TypeVehicle;
import com.company.entity.manager.GarageManager;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage();
        GarageManager garageManager = new GarageManager(garage);

        Vehicle moto = new Vehicle(new Proprietor("Tobias", 1, "abc123") , TypeVehicle.MOTORCYCLE);
        Vehicle car = new Vehicle(new Proprietor("Juan", 2, "xyz987"), TypeVehicle.CAR);
        Vehicle van = new Vehicle(new Proprietor("Pedro", 3, "def456"), TypeVehicle.VAN);

        garageManager.addVehicle(moto, 1, TypeGarage.FIXED);
        garageManager.addVehicle(car, 2, TypeGarage.FIXED);
        garageManager.addVehicle(van, 4, TypeGarage.MOBILE);

        //System.out.println("Cantidad de vehiculos en el garage : " + garageManager.occupiedSpace());

        //garageManager.removeVehicle(car);

        System.out.println("Cantidad de vehiculos en el garage : " + garageManager.occupiedSpace());

        System.out.println("Monto total : " + garageManager.calculateTotalCost());
    }
}
