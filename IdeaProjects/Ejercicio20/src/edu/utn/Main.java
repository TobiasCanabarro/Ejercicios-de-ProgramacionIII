package edu.utn;

import edu.utn.entity.Article;
import edu.utn.entity.PriceList;
import edu.utn.entity.TypeSale;
import edu.utn.manager.ArticleManager;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String CURRENT_DATE= "20/04/2020";
    private static final int WHOLESALE_DISCOUNT = 20;
    private static final int MINORITY_INCREASE = 20;

    public static void main(String[] args) {

        // Creacion de Articulos

        Article tv = new Article();
        tv.setName("Tv 32");
        tv.setProductionCost(200);
        tv.setTypeSale(TypeSale.Minority);
        tv.setObservation("");

        Article phone = new Article();
        phone.setName("J7");
        phone.setTypeSale(TypeSale.Wholesaler);
        phone.setProductionCost(60);
        phone.setObservation("Esta en oferta");

        Article radio = new Article();
        radio.setName(null);
        radio.setTypeSale(TypeSale.Minority);
        radio.setObservation("Vieja");
        radio.setProductionCost(360);

        List<Article> articles = new ArrayList<>();
        articles.add(tv);
        articles.add(phone);
        articles.add(radio);

        ArticleManager manager = new ArticleManager();
        List<Article> validArticles = manager.validateArticles(articles);
        manager.priceRestructuring(validArticles);


        // Creacion de precios de ventas

        PriceList priceTv = new PriceList();
        priceTv.setName("Tv 32");
        priceTv.setObservation("Tiene 6 cuotas");
        priceTv.setDate(CURRENT_DATE);

        PriceList pricePhone = new PriceList();
        pricePhone.setName("J7");
        pricePhone.setObservation("Esta en oferta");
        pricePhone.setDate(CURRENT_DATE);

        PriceList priceRadio = new PriceList();//-.
        pricePhone.setName("Radio");
        pricePhone.setObservation("Esta en oferta");
        pricePhone.setDate(CURRENT_DATE);

        // Asignacion de productos a las listas correspondientes

        List<PriceList> minorityList = new ArrayList<>();

        pricePhone.setSaleCost( phone.getSaleCost() + MINORITY_INCREASE ); // seteo costo minoritario
        priceTv.setSaleCost( tv.getProductionCost() + MINORITY_INCREASE);   // seteo costo minoritario
        priceRadio.setSaleCost( radio.getProductionCost() + MINORITY_INCREASE);// seteo costo minoritario

        minorityList.add(priceRadio);
        minorityList.add(pricePhone);
        minorityList.add (priceTv);

        List<PriceList> wholesalerList = new ArrayList<>();

        pricePhone.setSaleCost( phone.getSaleCost() - WHOLESALE_DISCOUNT); // seteo costo mayoritario
        priceTv.setSaleCost( tv.getProductionCost() - WHOLESALE_DISCOUNT);   // seteo costo mayoritario
        priceRadio.setSaleCost( radio.getProductionCost() - WHOLESALE_DISCOUNT);   // seteo costo mayoritario
        
        wholesalerList.add(priceRadio);
        wholesalerList.add(pricePhone);
        wholesalerList.add (priceTv);

        manager.searchPrices(minorityList, wholesalerList, validArticles);
        manager.showArticles(validArticles);
    }
}
