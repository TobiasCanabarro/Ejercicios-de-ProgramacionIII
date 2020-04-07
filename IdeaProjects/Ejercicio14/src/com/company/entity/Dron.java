package com.company.entity;

public class Dron {

    private float speed;
    private String camaraType;
    private Tool tool;
    private float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public String getCamaraType() {
        return camaraType;
    }

    public void setCamaraType(String camaraType) {
        this.camaraType = camaraType;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void generateFeature (){
        int finalWeight = getTool().getWeight() - 200;
        while (finalWeight > 0 && getSpeed() > 0 && getHeight() > 0) {
            this.height = (getHeight() * 2) / 100 ;
            this.speed = ((getSpeed() * 5) / 100);
            finalWeight -= 50;
        }
    }

    public String showFeature (){
        Tool aux = getTool();
        getTool().toString();
        return "Name tool : " + aux.getNameTool()+ " Height : " + String.valueOf(getHeight()) + " Speed : " +
                String.valueOf(getSpeed()) + " Camara : " + getCamaraType();
    }
}
