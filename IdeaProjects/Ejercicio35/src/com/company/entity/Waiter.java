package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void add(Order order){
        if(orders == null){
            orders = new ArrayList<>();
        }
        orders.add(order);
    }
}
