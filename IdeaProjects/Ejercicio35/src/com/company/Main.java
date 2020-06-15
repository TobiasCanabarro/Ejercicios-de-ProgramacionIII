package com.company;

import com.company.entity.Order;
import com.company.entity.Person;
import com.company.entity.Waiter;

public class Main {

    public static void main(String[] args) {

        Order order1 = new Order("ensalada de papa");
        Order order2 = new Order("sopa de murcielago");
        Order order3 = new Order("sopa de mono");
        Order order4 = new Order("Langosta");

        Waiter waiter = new Waiter();
        waiter.add(order1);
        waiter.add(order2);
        waiter.add(order3);
        waiter.add(order4);

        Person pedro = new Person("Pedro", order1);
        Person juan = new Person("Juan", order2);
        juan.setDiner(pedro);
        Person manuel = new Person("Manuel", order3);
        manuel.setDiner(juan);
        Person martin = new Person("Martin", order4);
        martin.setDiner(manuel);

        martin.isYourRequest(waiter.getOrders());
        martin.orderCompleted();
    }
}
