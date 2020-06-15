package edu.utn.manager;

import edu.utn.enitty.Item;
import edu.utn.enums.Material;

import java.util.List;

public class ItemManager extends Item {
    private static final int FIRST_POS = 0;
    private static final String ERROR = "ERROR EN LISTA";

    public ItemManager(Material material, int volume) {
        super(material, volume);
    }

    private boolean isSimple(Item item1, Item itemContented){
        return item1 == null && itemContented == null;
    }

    private boolean isContainer (Item item,  Item itemContented){
        return item != null && itemContented == null;
    }

    private boolean isContained (Item item){
        return item != null && item.getItems().get(FIRST_POS) == null;
    }

    private boolean isSambuchito(Item item, Item itemContented){
        return item != null && item.getItems().get(FIRST_POS) != null;
    }

    public String featureItems(Item item){

        Item itemContented = item.getItems().get(FIRST_POS);

            if(isSimple(item, itemContented)){
                return "Es simple";
            }

            if(isContainer(item, itemContented)){
                return "Es contenedor";
            }
            if(isContained(itemContented)){
                return "Es contendio";
            }
            if(isSambuchito(item, itemContented)){
                return "Es sambuchito";
            }

        return ERROR;
    }

    public void analizeManager (Item item){
        System.out.println( featureItems(item));
        for (Item element : item.getItems()){
            analizeManager(element);
        }
    }
}
