package com.company.entity.falderPerr177;

import com.company.entity.grON3.exception.DiviceException;

public class FalderP {

    private static final String NOT_FOUND_DEVICE = "ERR_NOT_FOUND_DEVICE";
    private Perr177 perr177;

    public FalderP (int id){
        setPerr177(new Perr177(id));
    }

    public Perr177 getPerr177() {
        return perr177;
    }

    public void setPerr177(Perr177 perr177) {
        this.perr177 = perr177;
    }

    public Perr177 getData (int id) throws DiviceException {
        if(id >=1 && id <= 10){
            return  getPerr177();
        }
        else {
            throw new DiviceException(NOT_FOUND_DEVICE);
        }
    }


}
