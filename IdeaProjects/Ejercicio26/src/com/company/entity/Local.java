package com.company.entity;

public interface Local {

    int getId();
    String getName();
    Local search(int id);
    Local remove(int id);
    void add(Local local);

}
