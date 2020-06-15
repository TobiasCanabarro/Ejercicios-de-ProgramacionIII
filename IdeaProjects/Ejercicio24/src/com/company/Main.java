package com.company;

import com.company.entity.*;

public class Main {

    public static void main(String[] args) {

        DriverGiraMax driverGiraMax = new DriverGiraMax();
        DriverMolinit driverMolinit = new DriverMolinit();

        Adapter molinit = new MolinitDevice(driverMolinit);
        Adapter giraMax = new GiraMaxDivice(driverGiraMax);

        System.out.println("Molinit In : " + molinit.getNumberPeopleIn() );
        System.out.println( "Molinit Out" + molinit.getNumberPeopleOut() );

        System.out.println("Giramax In : " + giraMax.getNumberPeopleIn() );
        System.out.println("Giramax Out : " + giraMax.getNumberPeopleOut() );

    }
}
