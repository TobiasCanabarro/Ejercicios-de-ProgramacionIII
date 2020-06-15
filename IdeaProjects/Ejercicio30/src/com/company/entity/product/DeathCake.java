package com.company.entity.product;

import com.company.entity.Reseta;

public class DeathCake extends CakeShop{

    public static final String WITHOUT_MEASURE = "";

    public DeathCake() {
        getIngredients().add(new Reseta(10, "huevos de lagarto", ""));
        getIngredients().add(new Reseta(300, "Harina", "gr"));
        getIngredients().add(new Reseta(3, "Gotas de amonio",WITHOUT_MEASURE));
        setIngredients(getIngredients());
    }

    @Override
    public void feature() {
        System.out.println("-----------------------------");
        System.out.println("DeathCake reseta : ");
        super.feature();
    }
}
