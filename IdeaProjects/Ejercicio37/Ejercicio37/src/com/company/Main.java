package com.company;

import com.company.entity.Tamagotchi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu (){
        String messege = "Acciones del Tamagotchi : " + " a) Alimentar, p) Jugar, n) Nivel de felicidad, s) Salir";
        Scanner scanner  = new Scanner(System.in);
        Tamagotchi tamagotchi = new Tamagotchi();
        char option;

        while(true){
            System.out.println(messege);
            option = scanner.next().charAt(0);
            switch (option){
                case 'a' : tamagotchi.eat();
                tamagotchi.stateActual();
                break;
                case 'p' : tamagotchi.play();
                tamagotchi.stateActual();
                break;
                case 'n' :
                    System.out.println("Nivel de felicidad : " + tamagotchi.levelHappiness());
                tamagotchi.stateActual();
                break;
                case 's' : System.out.println("Nos vemos..");System.exit(0);
                break;
                default :System.out.println("Opcion no valida");
            }
        }
    }
}
