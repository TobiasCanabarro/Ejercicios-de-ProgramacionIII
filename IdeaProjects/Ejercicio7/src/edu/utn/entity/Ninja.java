package edu.utn.entity;

public class Ninja {
    private String arteMarcial;
    private String arma;
    private int fuerza;
    private int salto;

    public void setArteMarcial (String arteMarcial){
        this.arteMarcial = arteMarcial;
    }

    public void setArma (String arma){
        this.arma = arma;
    }

    public void setFuerza (int fuerza){
        this.fuerza = fuerza;
    }

    public void setSalto (int salto){
        this.salto = salto;
    }

    public int getFuerza (){
        return this.fuerza;
    }

    public int getSalto (){
        return this.salto;
    }

    public String getArma (){
        return this.arma;
    }

    public String getArteMarcial (){
        return this.arteMarcial;
    }

    public void addAttribute (Ninja persona, String arteMarcial, String arma, int fuerza, int salto){
        persona.setArteMarcial(arteMarcial);
        persona.setArma(arma);
        persona.setFuerza(fuerza);
        persona.setSalto(salto);
    }

    public void Salto (int poder){
        System.out.println("Salto de : " + (this.salto * poder));
    }

    public void Ataque (){
        System.out.println("Arma : " + getArma());
        System.out.println("Arte marcial : " + getArteMarcial());
    }
}
