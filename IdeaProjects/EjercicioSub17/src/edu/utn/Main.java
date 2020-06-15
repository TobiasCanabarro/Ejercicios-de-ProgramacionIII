package edu.utn;

import edu.utn.enitty.Item;
import edu.utn.enitty.Scanner;
import edu.utn.enums.Material;
import edu.utn.manager.ItemManager;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner();

        Item apple = new Item(Material.METAL, 10);

        Item briefcase = new Item (Material.PLASTIC, 700);
        Item teeShirt = new Item (Material.OTHER, 50);
        Item bottle = new Item (Material.PLASTIC, 500);
        Item lilBall = new Item (Material.METAL, 10);

        briefcase.add(teeShirt);
        bottle.add(lilBall);
        briefcase.add(bottle);

        scanner.performScan(briefcase);

        ItemManager manager = new ItemManager(Material.OTHER,0);
        manager.analizeManager(briefcase);
    }
}
