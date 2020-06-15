package edu.utn;

import edu.utn.entity.Article;
import edu.utn.entity.PriceList;
import edu.utn.entity.TypeSale;
import edu.utn.manager.ArticleManager;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String CURRENT_DATE= "20/04/2020";

    public static void main(String[] args) {

        // Creacion de Articulos

        Article tv = new Article();
        tv.setName("Tv 32");
        tv.setProductionCost(100);
        tv.setTypeSale(TypeSale.Minority);
        tv.setObservation("");

        Article phone = new Article();
        phone.setName("J7");
        phone.setTypeSale(TypeSale.Wholesaler);
        phone.setProductionCost(50);
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
        pricePhone.setSaleCost(100); // seteo costo minoritario
        priceTv.setSaleCost(200);   // seteo costo minoritario
        pricePhone.setSaleCost(400);// seteo costo minoritario
        minorityList.add(priceRadio);
        minorityList.add(pricePhone);
        minorityList.add (priceTv);

        List<PriceList> wholesalerList = new ArrayList<>();
        pricePhone.setSaleCost(80); // seteo costo mayoritario
        priceTv.setSaleCost(150);   // seteo costo mayoritario
        priceRadio.setSaleCost(320);   // seteo costo mayoritario
        wholesalerList.add(priceRadio);
        wholesalerList.add(pricePhone);
        wholesalerList.add (priceTv);

        ArticleManager manager = new ArticleManager();
        List<Article> validArticles = manager.validateArticles(articles);
        manager.searchPrices(minorityList, wholesalerList, validArticles);
        manager.showArticles(validArticles);
    }
}
