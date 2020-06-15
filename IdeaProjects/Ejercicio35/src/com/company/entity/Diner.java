package com.company.entity;

import java.util.List;

public abstract class Diner {

    private boolean orderReceived;
    private Order order;

    public boolean isOrderReceived() {
        return orderReceived;
    }

    public void setOrderReceived(boolean orderReceived) {
        this.orderReceived = orderReceived;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public abstract void isYourRequest(List<Order> requests);

    public abstract void orderCompleted();

}
