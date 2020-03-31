package edu.utn;

import edu.utn.entity.Ninja;

public class Main {

    public static void main(String[] args) {
        Ninja persona = new Ninja();
        persona.addAttribute(persona, "taekwondo", "chacos", 100, 50);
        persona.Salto(20);
        persona.Ataque();

        Ninja persona2 = new Ninja();
        persona2.addAttribute(persona2, "karate", "espada", 80, 150);
        persona2.Salto(50);
        persona2.Ataque();


    }
}
