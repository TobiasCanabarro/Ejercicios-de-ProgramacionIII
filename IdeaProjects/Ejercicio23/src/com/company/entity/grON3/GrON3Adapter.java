package com.company.entity.grON3;

import com.company.entity.Dron;
import com.company.entity.grON3.exception.DiviceException;

import java.util.List;

public class GrON3Adapter extends Dron {

    private GrON3 dron;

    public GrON3Adapter(GrON3 dron) {
        setDron(dron);
    }

    public GrON3 getDron() {
        return dron;
    }

    public void setDron(GrON3 dron) {
        this.dron = dron;
    }

    public List<GrOn3Object> getInfoDron () throws DiviceException {
        return getDron().getFlyingGr0n3().getData(getDron().getId());
    }

    public void printInfo () throws DiviceException {
        System.out.println("--------------------------------------------------------");
        for(GrOn3Object element : getInfoDron()){
            System.out.println("Dispositivo : " + getDron().getId());
            System.out.println("Tipo : " + element.getType()); //admite los valores human, animal.
            System.out.println("Tamaño : " + element.getSize()); //admite los valores big, small, medium.
            System.out.println("Observacion : " + element.getKind()); //si se trata de un animal, los valores posibles son dog, cat, cow, sheep, horse, undefined.
        }
    }

}
