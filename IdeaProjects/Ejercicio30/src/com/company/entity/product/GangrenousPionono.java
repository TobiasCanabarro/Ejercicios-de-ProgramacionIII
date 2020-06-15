package com.company.entity.product;

import com.company.entity.Reseta;

import java.util.List;

public class GangrenousPionono extends CakeShop{
    public static final String WITHOUT_MEASURE = "";

    public GangrenousPionono() {
        getIngredients().add(new Reseta(1, "Recorte de goma eva", WITHOUT_MEASURE));
        getIngredients().add(new Reseta(1, "Ojo daltonico", WITHOUT_MEASURE));
        getIngredients().add(new Reseta(200, "Harina", "gr"));
        setIngredients(getIngredients());
    }

    @Override
    public void feature() {
        System.out.println("-----------------------------");
        System.out.println("DevilishPudding reseta : ");
        super.feature();

    }
}
