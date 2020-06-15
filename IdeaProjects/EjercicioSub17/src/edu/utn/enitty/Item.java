package edu.utn.enitty;

import edu.utn.enums.Material;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private Material material;
    private int volume;
    private List<Item> items;

    public Item(Material material, int volume){
        this.material = material;
        this.volume = volume;
        //items = new ArrayList<>(); no es muy recomendable
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void add(Item item){
       getItems().add(item);
    }

    public void add(List<Item> items){
        getItems().addAll(items);
    }

    public List<Item> getItems() {
        if(items == null){
            items = new ArrayList<>();
        }
        return items;
    }

}
