package com.company.entity;

public class Singleton {

    private static Singleton person;
    private int age;

    protected Singleton() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Singleton getInstance (){
        if(person == null){
            person = new Singleton();
        }
        return person;
    }

}
