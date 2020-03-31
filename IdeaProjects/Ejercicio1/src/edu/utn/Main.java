package edu.utn;

import edu.utn.entity.Persona;

public class Main {

    public static void main(String[] args) {
	    Persona juan = new Persona();
	    juan.setName("Juan");
	    juan.setLastName("Diaz");
        juan.showName();
        juan.showLastName();
    }
}

