package com.company.entity;

public class Guardia extends Persona  {

    public String controlarDocumento (Visita Luis){
        Integer DNI = Luis.getDni();
        String mensaje = "Adelante " + Luis.getName() + " " + Luis.getLastName() + " con el dni " + DNI.toString();
        return mensaje;
    }
}
