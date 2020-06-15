package com.company.entity;

public class ArticlePromotion{

    private Article article;
    private int cantArticle;

    public ArticlePromotion (Article article, int cant){
        setArticle(article);
        setCantArticle(cant);
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getCantArticle() {
        return cantArticle;
    }

    public void setCantArticle(int cantArticle) {
        this.cantArticle = cantArticle;
    }
}
