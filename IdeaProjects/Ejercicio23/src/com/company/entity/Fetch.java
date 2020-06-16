package com.company.entity;

import com.company.entity.falderPerr177.FalderPerr177;
import com.company.entity.falderPerr177.FalderPerr177Adapter;
import com.company.entity.grON3.GrON3;
import com.company.entity.grON3.GrON3Adapter;
import com.company.entity.grON3.exception.DiviceException;

public class Fetch {

    private int idAvailable = 0;

    public void fetchSurveillanceData() throws DiviceException {

        GrON3 dron = new GrON3(++idAvailable);
        GrON3Adapter grON3Adapter = new GrON3Adapter(dron);
        grON3Adapter.printInfo();

        GrON3 dron2 = new GrON3(++idAvailable);
        GrON3Adapter grON3Adapter2 = new GrON3Adapter(dron2);
        grON3Adapter2.printInfo();

        FalderPerr177 dron3  = new FalderPerr177(++idAvailable);
        FalderPerr177Adapter falderPerr177Adapter = new FalderPerr177Adapter(dron3);
        falderPerr177Adapter.printInfo();

        FalderPerr177 dron4  = new FalderPerr177(++idAvailable);
        FalderPerr177Adapter falderPerr177Adapter2 = new FalderPerr177Adapter(dron4);
        falderPerr177Adapter2.printInfo();
    }
}
