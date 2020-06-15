package com.company.entity;

import java.util.List;

public class Singleton {

    private static Singleton person;
    private String name;
    private int age;
    private List<String> son;

    private Singleton (){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSon() {
        return son;
    }

    public void setSon(List<String> son) {
        this.son = son;
    }

    public static Singleton getInstance(){
        if(person == null){
            person = new Singleton();
        }
        return person;
    }

    public void showData(){
        System.out.println(person.getName());
        System.out.println(person.getAge());
        for(String element : person.getSon()){
            System.out.println(element);
        }
    }
}
