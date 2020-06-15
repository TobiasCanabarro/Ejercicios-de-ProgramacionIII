package edu.utn.entity;

public   class Customer {

    private int id;
    private int seniority; // shift + F6
    private int laborOld;
    private Person person;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getLaborOld() {
        return laborOld;
    }

    public void setLaborOld(int laborOld) {
        this.laborOld = laborOld;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
