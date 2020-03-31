package edu.utn;

import edu.utn.entity.Choffer;
import edu.utn.entity.Car;

public class Main { // sout + enter

    public static void main(String[] args) {
        Choffer Pedro = new Choffer();
        Pedro.setName("Pedro");

        Car Auto = new Car (Pedro);
        Car Autito = new Car ();
        Auto.printDriverName();
    }
}
