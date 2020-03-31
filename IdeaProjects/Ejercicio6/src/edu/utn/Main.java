package edu.utn;
import edu.utn.entity.Fruta;

public class Main {

    public static void main(String[] args) {

	    Fruta apple = new Fruta ();
	    apple.addAttribute("red", 150f, true);
        if (apple.isEdible()){
            System.out.println("La Fruta es comestible");
        }
        else{
            System.out.println("La Fruta no es comestible");
        }

        Fruta banana = new Fruta("yellow", 250f, true);
        if (banana.isEdible()){
            System.out.println("La Fruta es comestible");
        }
        else{
            System.out.println("La Fruta no es comestible");
        }
    }
}
