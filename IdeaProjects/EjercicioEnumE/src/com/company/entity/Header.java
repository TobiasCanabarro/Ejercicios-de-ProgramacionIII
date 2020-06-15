package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class Header {

    private int number;
    private Date date;
    private List<Article> list;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Article> getList() {
        return list;
    }

    public void setList(List<Article> list) {
        this.list = list;
    }

    public void add(Article article){
        if(list == null){
            list = new ArrayList<>();
        }
        list.add(article);
    }
}
