package com.company.entity;

import java.util.List;

public class Recipe {
    private String name;
    private List<Ingredient> ingredients;

    public Recipe(String name, List<Ingredient> ingredients) {
        setName(name);
        setIngredients(ingredients);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    private void showIngredients (){
        System.out.println("Ingredients : ");
        for(Ingredient ingredient : getIngredients()){
            System.out.println(ingredient.getName() + ", quantity " + ingredient.getQuantity());
        }
    }

    public void feature (){
        System.out.println("Recipe : " + getName());
        showIngredients();
    }
}
