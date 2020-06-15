package com.company;

import com.company.entity.Article;
import com.company.entity.Promotion;
import com.company.entity.manager.PromotionManager;

import java.util.List;

public class Main {

    private final static int DISCOUNT = 20;

    public static void main(String[] args) {

        Article hotDog = new Article("Pancho", 10, 101);
        Article coke = new Article("La coca", 20, 102);

        PromotionManager promotionManager = new PromotionManager();
        promotionManager.add(hotDog, 2);
        promotionManager.add(coke, 1);

        Promotion promotion1 = promotionManager.create("Promo 1", promotionManager.getArticlePromotions(), DISCOUNT);
        promotion1.feature();
        /*
        * Falata la lista de Product*/
    }
}
