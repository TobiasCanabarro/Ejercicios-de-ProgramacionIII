package edu.utn.entity;

public class Cine {
    private String film;
    private float schedule;

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public float getSchedule() {
        return schedule;
    }

    public void setSchedule(float schedule) {
        this.schedule = schedule;
    }

    public Cine getBillboard (){
        Cine movie = new Cine();
        return movie;
    }

    public void showFilm (){
        System.out.println("Film : " + getFilm());
        System.out.println("Schedule : " + getSchedule());
    }
}
