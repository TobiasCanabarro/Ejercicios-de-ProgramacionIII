package edu.utn;
import edu.utn.entity.Cine;

public class Main {

    public static void main(String[] args) {
    	 Cine aux = new Cine();
	     Cine movie = aux.getBillboard();
	     movie.setFilm("The Joker");
		 movie.setSchedule(15.00f);
	     movie.showFilm();
    }
}
