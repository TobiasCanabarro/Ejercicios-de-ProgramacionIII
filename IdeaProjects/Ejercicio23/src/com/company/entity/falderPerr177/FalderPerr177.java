package com.company.entity.falderPerr177;

public class FalderPerr177 {

    private int id;
    private FalderP falderP;

    public FalderPerr177 (int id){
        setId(id);
        setFalderP(new FalderP(id));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FalderP getFalderP() {
        return falderP;
    }

    public void setFalderP(FalderP falderP) {
        this.falderP = falderP;
    }
}
