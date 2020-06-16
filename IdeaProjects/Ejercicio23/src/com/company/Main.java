package com.company;

import com.company.entity.Fetch;
import com.company.entity.grON3.exception.DiviceException;

public class Main {

    public static void main(String[] args) throws DiviceException {
        Fetch fetch = new Fetch();
        fetch.fetchSurveillanceData();
    }
}
