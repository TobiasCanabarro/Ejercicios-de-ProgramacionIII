package com.company.entity;

public class SingletonCaller{

    private static Singleton person;

    public SingletonCaller (Singleton person){
        this.person = person;
    }

    public void calling(){
        System.out.println(person.getAge());
    }
}
