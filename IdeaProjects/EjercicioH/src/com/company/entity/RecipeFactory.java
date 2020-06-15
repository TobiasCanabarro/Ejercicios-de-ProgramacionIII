package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class RecipeFactory {
    private List<Ingredient> ingredients;

    public Recipe createRecipe (String name, List<Ingredient> ingredients){
        return new Recipe(name, ingredients);
    }

    public void add(Ingredient ingredient){
        if(ingredients == null){
            ingredients = new ArrayList<>();
        }
        ingredients.add(ingredient);
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
