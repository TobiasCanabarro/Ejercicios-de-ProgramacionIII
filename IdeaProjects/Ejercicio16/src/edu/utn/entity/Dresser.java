package edu.utn.entity;

public class Dresser extends Item {
    private int area;
    private int drawers;

    public Dresser(String description) {
        super(description);
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getDrawers() {
        return drawers;
    }

    public void setDrawers(int drawers) {
        this.drawers = drawers;
    }
}
