package com.company;

import com.company.entity.*;

public class Main {

    public static void main(String[] args) {

        DriverGiraMax driverGiraMax = new DriverGiraMax();
        DriverMolinit driverMolinit = new DriverMolinit();
        RotativityDriver rotativityDriver = new RotativityDriver();

        Adapter molinit = new MolinitDevice(driverMolinit);
        Adapter giraMax = new GiraMaxDivice(driverGiraMax);
        Adapter rotativityDevice = new RotativityDevice(rotativityDriver);

        System.out.println("Molinit In : " + molinit.getNumberPeopleIn() );
        System.out.println( "Molinit Out : " + molinit.getNumberPeopleOut() );

        System.out.println("Giramax In : " + giraMax.getNumberPeopleIn() );
        System.out.println("Giramax Out : " + giraMax.getNumberPeopleOut() );

        System.out.println("Rotative In : " + rotativityDevice.getNumberPeopleIn());
        System.out.println("Rotative Out : " + rotativityDevice.getNumberPeopleOut());
    }
}
