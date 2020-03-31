package edu.utn;
import edu.utn.entity.Cine;

public class Main {

    public static void main(String[] args) {
        Cine film = new Cine();
        film.createFilm("The Amazing Spiderman", 16.0f);
        film.showDatumFilm();

        Cine film2 = new Cine ();
        film2.createFilm("The Joker" , 20.30f);
        film2.showDatumFilm();

        film.createFilm("Iron man", 18.15f);
        film.showDatumFilm();

    }
}
