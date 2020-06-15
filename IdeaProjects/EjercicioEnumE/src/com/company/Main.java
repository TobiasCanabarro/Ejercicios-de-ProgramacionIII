package com.company;

import com.company.entity.Article;
import com.company.entity.Date;
import com.company.entity.Header;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int NUMBER = 1;

    public static void main(String[] args) {

        Header header = new Header();
        header.setNumber(NUMBER);
        header.setDate(new Date(17, 04, 20));

        Article art1 = new Article("Shampoo", 80f);
        Article art2 = new Article("Desodorante", 75f);
        Article art3 = new Article("Yerba", 120f);
        Article art4 = new Article("Harina 0000",80f);

        header.add(art1);
        header.add(art2);
        header.add(art3);
        header.add(art4);

        System.out.println("Number : " + header.getNumber());
        System.out.println("Date : " + header.getDate().showDate());
        System.out.println("List of article : ");

        for(Article element : header.getList()){
            System.out.println(element.featureArticle());
        }
    }
}
