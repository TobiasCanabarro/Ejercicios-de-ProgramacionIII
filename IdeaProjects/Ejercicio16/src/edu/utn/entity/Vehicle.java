package edu.utn.entity;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private int maxLoad;
    private List<Item> items;

    public Vehicle (){
        items = new ArrayList<>();
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public void load (Item item){

        if (listItem().size() < getMaxLoad()) {
            items.add(item);
        }
    }

    public List<Item> listItem (){
        return items; // listItems().get(posList);
    }

    /*
    public Item getItemAt (int pos) {
        return listItem().get(pos);
    }
     */

}
