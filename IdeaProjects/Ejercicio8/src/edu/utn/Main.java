package edu.utn;

import edu.utn.entity.Persona;
import edu.utn.entity.Guardia;
import edu.utn.entity.Visitante;


public class Main {

    public static void main(String[] args) {
        Persona Juan = new Persona ();
        Juan.setName("Juan");
        Juan.setLastName("Diaz");

        Guardia Pedro = new Guardia();
        Pedro.setName("Pedro");
        Pedro.setLastName("Gomez");

        Visitante Jose = new Visitante();
        Jose.setName("Jose");
        Jose.setLastName("Perez");

        Juan.showDatumPersona();
        Pedro.showDatumGuardia();
        Jose.showDatumVisitante();
    }
}
