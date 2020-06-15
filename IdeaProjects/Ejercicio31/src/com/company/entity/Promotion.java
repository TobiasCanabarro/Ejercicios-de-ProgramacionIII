package com.company.entity;

import java.util.List;

public class Promotion extends Product{

    private List<ArticlePromotion> articles;
    private int discount;
    private int total;

    public Promotion(String name, List<ArticlePromotion> articles, int discount) {
        setName(name);
        setArticles(articles);
        setDiscount(discount);
    }

    public List<ArticlePromotion> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticlePromotion> articles) {
        this.articles = articles;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void feature (){
        System.out.println("-----------------------------------------------------------");
        System.out.println(getName() + " :");
        for(ArticlePromotion art : getArticles()){
            System.out.println("Article : " + art.getArticle().feature());
            System.out.println("Cant : " + art.getCantArticle());
        }
        System.out.println("Discount : " + getDiscount());
        System.out.println("Cost : $" + getCost());
    }
}
