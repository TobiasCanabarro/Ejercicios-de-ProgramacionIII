package com.company;

import com.company.entity.Reseta;
import com.company.entity.factory.CakeShopFactory;
import com.company.entity.factory.DeathCakeFactory;
import com.company.entity.factory.DevilishPuddingFactory;
import com.company.entity.factory.GangrenousPiononoFactory;
import com.company.entity.product.DeathCake;
import com.company.entity.product.DevilishPudding;
import com.company.entity.product.GangrenousPionono;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Reseta> devilishPuddingIngredients = new ArrayList<>();

        List<Reseta> deathCakeIngredients = new ArrayList<>();
        List<Reseta> gangrenousPiononoIngredients =  new ArrayList<>();

        DevilishPuddingFactory devilishPuddingFactory = new DevilishPuddingFactory(devilishPuddingIngredients);
        DeathCakeFactory deathCakeFactory = new DeathCakeFactory(deathCakeIngredients);
        GangrenousPiononoFactory gangrenousPiononoFactory = new GangrenousPiononoFactory(gangrenousPiononoIngredients);

        DevilishPudding devilishPudding = devilishPuddingFactory.create();
        DeathCake deathCake = deathCakeFactory.create();
        GangrenousPionono gangrenousPionono = gangrenousPiononoFactory.create();

        devilishPudding.feature();
        deathCake.feature();
        gangrenousPionono.feature();

    }
}
