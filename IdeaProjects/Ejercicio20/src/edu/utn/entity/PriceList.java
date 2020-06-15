package edu.utn.entity;

public class PriceList extends Article{
    private String name;
    private int price;
    private String date;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
