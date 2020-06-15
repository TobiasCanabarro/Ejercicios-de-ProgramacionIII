package edu.utn.manager;

import edu.utn.entity.Article;
import edu.utn.entity.PriceList;
import edu.utn.entity.TypeSale;

import javax.swing.plaf.basic.BasicButtonUI;
import java.util.ArrayList;
import java.util.List;

public class ArticleManager extends ValidateAttribute{

    private static final int LONG_MAX_OBSERVATION = 30;
    private static final int LONG_MAX_NAME = 15;
    private static final int HIGHEST_COST = 1000;
    private static final int LOWEST_COST = 1;
    private static final int EXCESS = 30;

    public List<Article> validateArticles (List<Article> articles){

        List<Article> validArticles = new ArrayList<>();
        String value;

        for (Article article : articles){

            value = validateAttributes(article);

            if(value.equals("OK")){
                validArticles.add(article);
            }
            else {
                System.out.println(getName() + " " + value);
            }
        }
        return validArticles;
    }

    private void searchMinorityPrice (List<PriceList> minorityList, Article article){

        for (PriceList price : minorityList){
            if(article.getName().equals(price.getName())){
                article.setSaleCost( price.getSaleCost() );
            }
        }
    }

    private void searchWholesalerPrice (List<PriceList> wholesalerList, Article article){

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

    private Article searchLowestPrice (List<Article> articles) {
        Article lowest = new Article();
        lowest.setProductionCost(HIGHEST_COST);
        for(Article article : articles){
            if(article.getProductionCost() < lowest.getProductionCost()){
                lowest = article;
            }
        }
        return lowest;
    }

    private Article searchHighestPrice (List<Article> articles){
        Article highest = new Article();
        highest.setProductionCost(LOWEST_COST);

        for(Article article : articles){
            if(article.getProductionCost() > highest.getProductionCost()){
                highest = article;
            }
        }
        return highest;
    }

    private List<Article> insetNewLowestPrice (List<Article> articles, Article lowestPrice){
        List<Article> newArticles = new ArrayList<>();

        for(int i = 0; i < articles.size(); i++){
           if(articles.get(i).getName().equals(lowestPrice.getName())){
               newArticles.add(lowestPrice);
           }
           newArticles.add(articles.get(i));
        }
        return newArticles;
    }

    public void priceRestructuring (List<Article> articles){

       Article highestPrice = searchHighestPrice(articles);
       Article lowestPrice = searchLowestPrice(articles);

       int difference = highestPrice.getProductionCost() - lowestPrice.getProductionCost();
       int excess = (highestPrice.getProductionCost() * EXCESS)/100;
       int aux = 0;

       if( difference > excess){
           aux = difference - excess;
           lowestPrice.setProductionCost(aux + lowestPrice.getProductionCost());
       }
       articles = insetNewLowestPrice(articles, lowestPrice);
    }

    public void showArticles (List<Article> articles){

        for (Article article : articles){
            System.out.println(article.feature());
        }
    }
}
