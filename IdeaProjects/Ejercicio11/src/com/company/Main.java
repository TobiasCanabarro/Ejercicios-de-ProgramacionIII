package com.company;

import com.company.entity.Guardia;
import com.company.entity.Persona;
import com.company.entity.Visita;

public class Main {

    public static void main(String[] args) {
        Persona Mario = new Persona();
        Guardia Juan = new Guardia();
        Visita Luis = new Visita();

        Mario.setName("Mario");
        Mario.setLastName("Chavez");
        Mario.showData();

        Juan.setName("Juan");
        Juan.setLastName("Diaz");
        Juan.showData();

        Luis.setName("Luis");
        Luis.setLastName("Fernandez");
        Luis.setDni(41138075);
        Luis.showData();
        System.out.println(Luis.getDni());
        System.out.println(Juan.controlarDocumento(Luis.getDni()));

    }
}
