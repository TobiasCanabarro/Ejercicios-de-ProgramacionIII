package edu.utn;

import edu.utn.entity.Menu;
import edu.utn.enums.Food;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu(Food.PASTA);
        System.out.println(menu.showFoodSelected());
    }
}
