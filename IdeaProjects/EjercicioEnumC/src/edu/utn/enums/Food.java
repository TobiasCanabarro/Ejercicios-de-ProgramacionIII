package edu.utn.enums;

public enum Food {

    CHICKEN("CHICKEN"), BARBECUE("BARBECUE"), FISH("FISH"), PASTA("PASTA");

    public String foodName;

    Food (String foodName){
        setFoodName(foodName);
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
