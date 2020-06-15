package com.company;

import com.company.entity.Ingredient;
import com.company.entity.Recipe;
import com.company.entity.factory.RecipeFactory;

public class Main {

    public static void main(String[] args) {
        RecipeFactory recipeFactory = new RecipeFactory();
        recipeFactory.add(new Ingredient("huevos"));
        recipeFactory.add(new Ingredient("harina leudan"));

        Recipe recipe = recipeFactory.createRecipe("La torta de la muerte", recipeFactory.getIngredients());
        recipe.feature();
    }
}
