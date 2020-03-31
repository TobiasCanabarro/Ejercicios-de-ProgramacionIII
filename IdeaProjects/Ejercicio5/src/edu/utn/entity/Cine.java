package edu.utn.entity;

public class Cine {
    private String nameFilm;
    private float schedule;

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public float getSchedule() {
        return schedule;
    }

    public void setSchedule(float schedule) {
        this.schedule = schedule;
    }

    public void createFilm (String nameFilm, float schedule){
        this.nameFilm = nameFilm;
        this.schedule = schedule;
    }

    public void showDatumFilm (){
        System.out.println("Name film : " + getNameFilm());
        System.out.println("Schedule : " + getSchedule());
    }


}
