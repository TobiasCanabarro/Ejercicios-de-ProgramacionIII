package edu.utn.entity;

public class Item {

    private int id;
    private String description;
    private int height;
    private int width;
    private int longth;

    public Item (String description){
        setDescription(description);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLongth() {
        return longth;
    }

    public void setLongth(int longth) {
        this.longth = longth;
    }
}
