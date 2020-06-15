package com.company;

import com.company.entity.Ingredient;
import com.company.entity.Recipe;
import com.company.entity.RecipeFactory;

public class Main {

    public static void main(String[] args) {
        RecipeFactory recipeFactory = new RecipeFactory();
        recipeFactory.add(new Ingredient("huevos", 2));
        recipeFactory.add(new Ingredient("harina leudante", 200));

        Recipe recipe = recipeFactory.createRecipe("La torta de la muerte", recipeFactory.getIngredients());
        recipe.feature();
    }
}
