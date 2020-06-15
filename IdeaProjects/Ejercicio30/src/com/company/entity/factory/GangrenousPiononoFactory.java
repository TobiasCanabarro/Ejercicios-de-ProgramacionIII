package com.company.entity.factory;

import com.company.entity.Reseta;
import com.company.entity.product.CakeShop;
import com.company.entity.product.GangrenousPionono;

import java.util.List;

public class GangrenousPiononoFactory extends CakeShopFactory{

    public GangrenousPiononoFactory(List<Reseta> ingredients) {
        super(ingredients);
    }

    @Override
    public GangrenousPionono create() {
        return new GangrenousPionono();
    }
}
