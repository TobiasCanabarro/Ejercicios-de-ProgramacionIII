package edu.utn.entity;

import edu.utn.enums.Food;

public class Menu {
    private Food nameFood;

    public Menu (Food nameFood){
        setNameFood(nameFood);
    }

    public Food getNameFood() {
        return nameFood;
    }

    public void setNameFood(Food nameFood) {
        this.nameFood = nameFood;
    }

    public String showFoodSelected(){
        return getNameFood().toString();
    }
}
