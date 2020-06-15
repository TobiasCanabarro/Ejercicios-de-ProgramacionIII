package com.company.entity.factory;

import com.company.entity.Article;

public class ArticleFactory {

    public Article create (String name, int cost, int barcode){
        return new Article(name, cost, barcode);
    }
}
