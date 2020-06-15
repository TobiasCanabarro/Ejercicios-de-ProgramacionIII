package edu.utn.manager;

import edu.utn.entity.Article;
import edu.utn.entity.PriceList;
import edu.utn.entity.TypeSale;

import java.util.ArrayList;
import java.util.List;

public class ArticleManager extends Article {

    private boolean validateAttributes (Article article){
        return article.getName() != null && article.getProductionCost() != 0 && article.getTypeSale() != null;
    }

    public List<Article> validateArticles ( List<Article> articles){

        List<Article> validArticles = new ArrayList<>();

        for (Article article : articles){
            if(validateAttributes(article)){
                validArticles.add(article);
            }
        }
        return validArticles;
    }

    private void searchMinorityPrice  ( List<PriceList> minorityList, Article article){

        for (PriceList price : minorityList){
            if(article.getName().equals(price.getName())){
                article.setSaleCost( price.getSaleCost() );
            }
        }
    }

    private void searchWholesalerPrice(List<PriceList> wholesalerList, Article article){

        for (PriceList price : wholesalerList){
            if(article.getName().equals(price.getName())){
                article.setSaleCost( price.getSaleCost() );
            }
        }
    }

    public void searchPrices ( List<PriceList> minorityList, List<PriceList> wholesalerList, List<Article> articles){

        for (Article article : articles){

            if(article.getTypeSale().equals(TypeSale.Minority.getType())){
                searchMinorityPrice(minorityList, article);
            }
            else {
                searchWholesalerPrice (wholesalerList, article);
            }
        }
    }

    public String feature (){
        super.feature();
        return " Sale cost : " + getSaleCost();
    }

    public void showArticles (List<Article> articles){

        for (Article article : articles){
            System.out.println(article.feature());
        }
    }

}
