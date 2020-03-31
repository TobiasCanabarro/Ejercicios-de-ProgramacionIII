package edu.utn.entity;

public class item {
    private String brand;
    private String model;

    public void setBrand (String brand){
        this.brand = brand;
    }
    public void setModel (String model){
        this.model = model;
    }
    public String getBrand (){
        return brand;
    }
    public String getModel (){
        return model;
    }
    public void showItem (){
        System.out.println("Brand : " + getBrand());
        System.out.println("Model : " + getModel());
    }

}
