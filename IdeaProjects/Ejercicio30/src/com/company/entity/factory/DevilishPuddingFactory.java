package com.company.entity.factory;

import com.company.entity.Reseta;
import com.company.entity.product.CakeShop;
import com.company.entity.product.DevilishPudding;

import java.util.List;

public class DevilishPuddingFactory extends CakeShopFactory{

    public DevilishPuddingFactory(List<Reseta> ingredients) {
        super(ingredients);
    }

    public DevilishPudding create() {
        return new DevilishPudding();
    }
}
