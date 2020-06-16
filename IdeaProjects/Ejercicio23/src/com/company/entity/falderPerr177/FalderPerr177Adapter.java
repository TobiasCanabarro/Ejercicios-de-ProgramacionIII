package com.company.entity.falderPerr177;

import com.company.entity.Dron;
import com.company.entity.grON3.exception.DiviceException;

public class FalderPerr177Adapter extends Dron{

    private FalderPerr177 dron;

    public  FalderPerr177Adapter (FalderPerr177 falderPerr177){
        setDron(falderPerr177);
    }

    public FalderPerr177 getDron() {
        return dron;
    }

    public void setDron(FalderPerr177 dron) {
        this.dron = dron;
    }

    private Perr177 getPerr177() throws DiviceException {
        return getDron().getFalderP().getData(getDron().getId());
    }

    @Override
    public void printInfo() throws DiviceException {
        System.out.println("--------------------------------------------------------");
        System.out.println("ID : " + getPerr177().getId());
        for(Perr177Data element : getPerr177().getObjectAnalyzed()){
            System.out.println("Tipo : " + element.getType().getType());
            System.out.println("Size : " + element.getSize().getSize());
            System.out.printf("Gender : " + element.getGender().getGender());
        }
        System.out.println();
    }


}
