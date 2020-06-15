package com.company.entity.factory;

import com.company.entity.ArticlePromotion;
import com.company.entity.Promotion;

import java.util.List;

public class PromotionFactory {

    public Promotion create (String namePromo, List<ArticlePromotion> articles, int discount){
        return new Promotion(namePromo, articles, discount);
    }
}
