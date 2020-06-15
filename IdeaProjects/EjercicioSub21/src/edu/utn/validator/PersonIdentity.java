package edu.utn.validator;

import edu.utn.entity.Person;

import java.util.Date;

public  class PersonIdentity {
    public static Person getInfo(int dni){
        //resuelve la busqueda de una persona y devolverla.
        Person p = new Person();
        p.setName("Juan");
        p.setLastName("Pedropicapiedras");
        p.setBirthDate(new Date(1998, 05, 14));
        return p;
    }
}
