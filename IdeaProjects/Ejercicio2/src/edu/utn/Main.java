package edu.utn;
import edu.utn.entity.Vehiculo;

public class Main {

    public static void main(String[] args) {
        Vehiculo car = new Vehiculo();
        car.setBrand("Ford");
        car.setModel("Eco Sport");
        car.showCar();
    }
}
