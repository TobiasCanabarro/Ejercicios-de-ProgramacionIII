package edu.utn;

import edu.utn.entity.*;

import java.util.List;


public class Main {

    private static final int MAX_LOAD_TRUCK = 10;
    private static final int MAX_LOAD_CAR = 5;

    public static void main(String[] args) {

        Tv tv20 = new Tv("TV 20");
        Tv tv32 = new Tv("TV 32");
        Bicycle bici = new Bicycle("Bici loca");
        Fridge fridge = new Fridge("Heladera fria");
        Dresser dresser = new Dresser("Comoda");

        Vehicle car = new Vehicle();
        car.setMaxLoad(MAX_LOAD_CAR);
        car.load(tv20);
        car.load (tv32);
        car.load(bici);

        Vehicle truck = new Vehicle();
        truck.setMaxLoad(MAX_LOAD_TRUCK);
        truck.load (fridge);
        truck.load(dresser);

        for (Item item : car.listItem()){
            System.out.println( "Item auto : " + item.getDescription());
        }

        for (Item item : truck.listItem()){
            System.out.println("Item truck : " + item.getDescription());
        }

    }
}
