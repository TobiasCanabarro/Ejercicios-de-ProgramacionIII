package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class Person extends Diner{

    private static final String RECEIVED = "recibio el plato";
    private String name;
    private Diner diner;

    public Person(String name, Order order){
        setName(name);
        setOrder(order);
        setOrderReceived(false);
    }

    public Diner getDiner() {
        return diner;
    }

    public void setDiner(Diner diner) {
        this.diner = diner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getNameOrder (Order order){
        return order.getName();
    }

    @Override
    public void isYourRequest(List<Order> orders) {

        for (int i = 0; i < orders.size(); ++i){
            if(getNameOrder(getOrder()).equals(getNameOrder(orders.get(i)))){
                setOrderReceived(true);
            }
        }
        if(diner != null) {
            diner.isYourRequest(orders);
        }
    }

    public void orderCompleted (){
        if(isOrderReceived()){
            System.out.println(getName() + " " + RECEIVED);
        }
        if(diner != null){
            diner.orderCompleted();
        }
    }
}
