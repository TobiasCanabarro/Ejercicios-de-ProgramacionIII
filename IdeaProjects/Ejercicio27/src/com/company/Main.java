package com.company;

import com.company.entity.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Singleton person = Singleton.getInstance();
        person.setName("Pablo");
        person.setAge(30);
        List<String> son = new ArrayList<>();
        son.add("Contantino");
        person.setSon(son);
        person.showData();
    }
}
