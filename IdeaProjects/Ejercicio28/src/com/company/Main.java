package com.company;

import com.company.entity.Singleton;
import com.company.entity.SingletonCaller;

public class Main {

    public static void main(String[] args) {
        Singleton person = Singleton.getInstance();
        person.setAge(22);
        SingletonCaller caller = new SingletonCaller(person);
        caller.calling();
    }
}
