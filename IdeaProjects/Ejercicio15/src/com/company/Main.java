package com.company;

import com.company.enity.BattleShip;
import com.company.enity.Boat;
import com.company.enity.Destroyer;
import com.company.enity.Hospital;

public class Main {

    public static void main(String[] args) {

        BattleShip battleShip = new BattleShip();
        battleShip.setFlotability(10);
        battleShip.setSolidity(10);
        battleShip.setStability(10);
        battleShip.setArmor(100);
        battleShip.setFirePower(10);
        battleShip.setSpeed(120);
        battleShip.setEngine(10);
        battleShip.setName("Acorazado");
        System.out.println( battleShip.getInfo() );

        Destroyer destroyer = new Destroyer();
        destroyer.setFirePower(20);
        destroyer.setManiobrability(20);
        destroyer.setSpeed(20);
        destroyer.setFlotability(20);
        destroyer.setSolidity(20);
        destroyer.setEngine(20);
        destroyer.setName("The Destroyer");
        System.out.println( destroyer.getInfo() );

        Hospital hospitalShip = new Hospital();
        hospitalShip.setFlotability(30);
        hospitalShip.setStability(30);
        hospitalShip.setLoadingCapacity(75);
        hospitalShip.setSpeed(10);
        hospitalShip.setEngine(10);
        hospitalShip.setName("Hospital Ship");
        System.out.println( hospitalShip.getInfo() );

        Boat boat = new Boat();
        boat.setSpeed(30);
        boat.setEngine(30);
        boat.setFlotability(30);
        boat.setStability(10);
        boat.setManiobrability(10);
        boat.setCrank(30);
        boat.setName("El gaucho");
        System.out.println( boat.getInfo() );
    }
}
