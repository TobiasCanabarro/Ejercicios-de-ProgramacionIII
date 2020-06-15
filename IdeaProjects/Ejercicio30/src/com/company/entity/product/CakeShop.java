package com.company.entity.product;

import com.company.entity.Reseta;

import java.util.ArrayList;
import java.util.List;

public abstract class CakeShop {
    private List<Reseta> ingredients;

    public List<Reseta> getIngredients() {
        if(ingredients == null){
            ingredients = new ArrayList<>();
        }
        return ingredients;
    }

    public void setIngredients(List<Reseta> ingredients) {
        this.ingredients = ingredients;
    }

    public void feature () {
        for (Reseta element : getIngredients()) {
            System.out.println(element.getCant() + " " + element.getMeasurementUnit() + " " + element.getIngredientType());
        }
    }

}
