package com.company.entity;

public class Article {
    private String name;
    private float price;

    public Article (String name, float price){
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String featureArticle(){
        return getName() + " " + getPrice();
    }
}
