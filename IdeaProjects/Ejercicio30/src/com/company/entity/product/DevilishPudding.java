package com.company.entity.product;

import com.company.entity.Reseta;

import java.util.List;

public class DevilishPudding extends CakeShop{

    public static final String WITHOUT_MEASURE = "";

    public DevilishPudding() {
        getIngredients().add(new Reseta(100, "Bilis", "cm2"));
        getIngredients().add(new Reseta(200, "Harina", "gr"));
        getIngredients().add(new Reseta(10, "Lavandina", "cm3"));
        setIngredients(getIngredients());
    }

    @Override
    public void feature() {
        System.out.println("-----------------------------");
        System.out.println("DevilishPudding reseta : ");
       super.feature();
    }
}
