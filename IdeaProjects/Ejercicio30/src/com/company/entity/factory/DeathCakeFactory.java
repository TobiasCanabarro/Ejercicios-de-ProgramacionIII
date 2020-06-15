package com.company.entity.factory;

import com.company.entity.Reseta;
import com.company.entity.product.CakeShop;
import com.company.entity.product.DeathCake;

import java.util.List;

public class DeathCakeFactory extends CakeShopFactory{

    public DeathCakeFactory(List<Reseta> ingredients) {
        super(ingredients);
    }

    @Override
    public DeathCake create() {
        return new DeathCake();
    }
}
