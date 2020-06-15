package edu.utn.entity;



public class Scanner extends Item{

    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String featureItem (){

        return "Matter : " + getItem().getMaterial() + " Volume : " + String.valueOf(getItem().getVolume()) +
                " Contain Object -> " + " Matter : " + getItem().getItemContents().getMaterial() + " Volume : " + getItem().getItemContents().getVolume() ;
    }
}
