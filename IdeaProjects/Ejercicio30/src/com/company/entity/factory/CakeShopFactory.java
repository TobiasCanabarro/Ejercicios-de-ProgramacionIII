package com.company.entity.factory;

import com.company.entity.Reseta;
import com.company.entity.product.CakeShop;
import com.company.entity.product.DevilishPudding;

import java.util.List;

public abstract class CakeShopFactory {

    private List<Reseta> ingredients;

    public CakeShopFactory(List<Reseta> ingredients) {
        setIngredients(ingredients);
    }

    public List<Reseta> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Reseta> ingredients) {
        this.ingredients = ingredients;
    }

    public abstract CakeShop create ();


}
