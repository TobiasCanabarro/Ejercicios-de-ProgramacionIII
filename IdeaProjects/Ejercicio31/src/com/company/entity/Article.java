package com.company.entity;

public class Article extends Product{

    public Article (String name, int cost, int barcode){
        setName(name);
        setCost(cost);
        setBarcode(barcode);
    }

    public String feature (){
        return getName() + " Cost : $" + getCost() + " Barcode : " + getBarcode();
    }
}
