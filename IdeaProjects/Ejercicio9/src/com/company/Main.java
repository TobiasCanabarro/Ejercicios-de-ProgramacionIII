package com.company;

import com.company.entity.Guardia;
import com.company.entity.Persona;

public class Main {

    public static void main(String[] args) {
        Persona Juan = new Persona ();
        Guardia Pedro = new Guardia ();

        Juan.setName("Juan");
        Juan.setLastName ("Diaz");
        Juan.showData();

        Pedro.setName("Pedro");
        Pedro.setLastName("Gomez");
        Pedro.showData();

    }
}
