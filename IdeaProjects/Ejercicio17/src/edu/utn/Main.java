package edu.utn;

import edu.utn.entity.Item;
import edu.utn.entity.Scanner;
import edu.utn.manager.ItemManager;

public class Main {

    public static void main(String[] args) {

        /*
        // PORTAFOLIO -> CONTAINER
        Item briefcase = new Item ();
        briefcase.createItem("Leather", 30);
        briefcase.setHasContent(false);
        briefcase.setHasObj(false);

        // BOTIQUIN DE PLASTICO -> CONTENEDOR
        Item hydrogenPeroxide = new Item();
        hydrogenPeroxide.createItem("Plastic", 10);
        hydrogenPeroxide.setHasObj(true);
        hydrogenPeroxide.setHasContent(false);

        Item gauze = new Item();
        gauze.createItem("Cloth", 5);
        gauze.setHasObj(true);
        gauze.setHasContent(false);
        gauze.setItemContents(hydrogenPeroxide);

        Item medicalKit = new Item();
        medicalKit.createItem("Plastic", 20);
        medicalKit.setHasObj(true);
        medicalKit.setHasContent(false);

        // BOLSA DE CUERO QUE CONTENGA UN PEINE Y UN BOTUIQUIN -> SAMBUCHITO
         */

        // MAMUSHKAS -> SAMBUCHITO
        Item mamushka1 = new Item();
        mamushka1.createItem("Black Wood", 10);
        mamushka1.setHasContent(true);
        mamushka1.setHasObj(true);

        Item mamushka2 = new Item();
        mamushka2.createItem("Yellow Wood", 20);
        mamushka2.setHasObj(true);
        mamushka2.setHasContent(true);
        mamushka2.setItemContents(mamushka1);// -> mamushka2 -> matter: Yellow Wood -> volume :  10 -> itemContent : mamushka1 -> ...

        Scanner scanner = new Scanner();
        scanner.setItem(mamushka2);
        System.out.println("Item scanned : " + scanner.featureItem());

        ItemManager itemManager = new ItemManager();
        System.out.println( "Feature : " + itemManager.analizeItem( scanner.getItem() )); //-> mamushka2 -> matter: Yellow Wood -> volume :  10 -> itemContent : mamushka1 -> ...
    }
}
