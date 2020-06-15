package edu.utn;

import edu.utn.entity.ListaDeArreglo;

public class Main {

    public static void main(String[] args) {
        ListaDeArreglo lista = new ListaDeArreglo();
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Alberto");
        lista.add("Diego");
        lista.add("Mariano");

        ListaDeArreglo lista2 = new ListaDeArreglo();
        lista2.add("Franco");
        lista2.add("Luis");
        lista2.addAll(lista);

        for (int i = 0; i < lista2.size(); i++){
            System.out.println(lista2.get(i));
        }

        lista2.clear();

        for (int i = 0; i < lista2.size(); i++){
            System.out.println(lista2.get(i));
        }
    }
}
