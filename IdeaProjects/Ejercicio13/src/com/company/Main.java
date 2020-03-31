package com.company;

import com.company.entity.Oruga;
import com.company.entity.Robot;
import com.company.entity.RuedaDeCaucho;

public class Main {

    public static void main(String[] args) {
        Robot arturito = new Robot();
        arturito.createRobot("KT-2020-P", 100, "Oruga");

        if (arturito.getTraccion().equals("Oruga")) {
            Oruga rueda = new Oruga(arturito.getNumeroDeSerie(), arturito.getPBT());
            rueda.processTraccion();
            rueda.showData();
        }
        else {
            RuedaDeCaucho rueda = new RuedaDeCaucho(arturito.getNumeroDeSerie(), arturito.getPBT());
            rueda.processTraccionRuedaDeCaucho();
            rueda.showData();
        }

    }
}
