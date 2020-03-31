package edu.utn.entity;

public class Fruta {
    private String color;
    private float peso;
    private boolean Estacional;

    public Fruta (String color, float peso, boolean Estacional){
        this.color = color;
        this.peso = peso;
        this.Estacional = Estacional;
    }

    public Fruta (){ // Constructor

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isEstacional() {
        return Estacional;
    }

    public void setEstacional(boolean estacional) {
        Estacional = estacional;
    }

    public void addAttribute (String color, float peso, boolean Estacional){
        this.color = color;
        this.peso = peso;
        this.Estacional = Estacional;
    }

    public boolean isEdible (){
        return this.peso < 200 && this.Estacional == true;
    }


}
