package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class RotativityDriver {

    public RotativityDriver (){
        rotativities = new int [2];
        addIn(3);
        addIn(8);
        addOut(10);
        addOut(20);
    }

    private int [] rotativities = null;

    public int[] getRotativities() {
        return rotativities;
    }

    public void addIn(int in){
        rotativities[0] += in;
    }

    public void addOut(int out){
        rotativities[1] += out;
    }

    public int[] getUsage (){
        return getRotativities();
    }

}
