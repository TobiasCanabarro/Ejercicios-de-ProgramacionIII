package com.company.entity.manager;

import com.company.entity.Article;
import com.company.entity.ArticlePromotion;
import com.company.entity.Promotion;
import com.company.entity.factory.PromotionFactory;

import java.util.ArrayList;
import java.util.List;

public class PromotionManager {

    private List<ArticlePromotion> articlePromotions;

    public List<ArticlePromotion> getArticlePromotions() {
        return articlePromotions;
    }

    private void calculateTotal (Promotion promotion){
        for( ArticlePromotion articlePromotion : promotion.getArticles()){
            promotion.setTotal( promotion.getTotal() + (articlePromotion.getArticle().getCost() * articlePromotion.getCantArticle()) );
        }
    }

    private void calculateCost (Promotion promotion){
        promotion.setCost((promotion.getTotal() * promotion.getDiscount())/100);
    }

    public Promotion create (String namePromo, List<ArticlePromotion> articles, int discount){
        PromotionFactory promotionFactory = new PromotionFactory();
        Promotion promotion = promotionFactory.create(namePromo, articles, discount);
        calculateTotal(promotion);
        calculateCost(promotion);
        return promotion;
    }

    public ArticlePromotion createArticlePromotion (Article article, int cant) {
        return new ArticlePromotion(article, cant);
    }

    public void add(Article article, int cant){
        if(articlePromotions == null){
            articlePromotions = new ArrayList<>();
        }
        articlePromotions.add(createArticlePromotion(article, cant));
    }
}
