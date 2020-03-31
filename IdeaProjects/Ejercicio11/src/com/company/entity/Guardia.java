package com.company.entity;

public class Guardia extends Persona{
    public String controlarDocumento (Integer dni){
        String mensaje = "Adelante persona con el dni " + dni.toString();
        return mensaje;
    }
}
