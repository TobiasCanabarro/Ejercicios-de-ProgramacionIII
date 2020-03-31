package edu.utn.entity;

public class Persona {
    private String name;
    private  String lastName;

    public void setName (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void showName (){
        System.out.println(getName()); //sout
    }

    public void showLastName (){
        System.out.println(getLastName());
    }
}
