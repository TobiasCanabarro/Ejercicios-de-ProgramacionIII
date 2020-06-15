package com.company.manager;

import com.company.entity.Person;
import com.company.entity.PersonIdentity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MinistryInterior extends PersonIdentity {

    private static final int YEAR_CURRENT = 2020;
    private static final int MONTH_CURRENT = 04;
    private static final int DATE_CURRENT = 26;
    private static final int AGE_REQUIRED = 21;
    private static final String LOAN_GRANTED = "Se pudo solicitar el prestamo";
    private static final String LOAN_DENIED_AGE = "El prestamos fue denegado por no reunir la edad suficiente";
    private static final String LOAN_DENIED_SALARY = "El prestamos fue denegado por tener el salario exedente a la capacidad";

    private List<Person> identities;

    public MinistryInterior(int dni, int antiquity, float netSalary) {
        super(dni, antiquity, netSalary);
    }

    public List<Person> getIdentities() {
        return identities;
    }

    public void setIdentities(List<Person> identities) {
        this.identities = identities;
    }

    public void add (Person person){
        if(identities == null){
            identities = new ArrayList<>();
        }
        identities.add(person);
    }

    public Person get (int pos){

        if(identities == null){
            identities = new ArrayList<>();
        }
        return identities.get(pos);
    }

    public int getDni (int pos){
        return get(pos).getDni();
    }

    private Person createPerson (String name, String lastName, int dni, Date birthDate){
        Person person = new Person();
        person.setName(name);
        person.setLastName(lastName);
        person.setDni(dni);
        person.setBirthDate(birthDate);
        return person;
    }

    public void completeIdentities (){
        Person person1 = createPerson("Juan", "Perez", 1, new Date (1998, 5, 14));
        Person person2 = createPerson("Mariano", "Gomez", 2, new Date (1990, 2, 12));
        Person person3 = createPerson("Maxi", "Diaz", 3, new Date (2000, 1, 2));
        Person person4 = createPerson("Pedro", "Martinez", 4, new Date (1986, 5, 23));
        add(person1);
        add(person2);
        add(person3);
        add(person4);
    }

    public Person getInfo(int dni) {
        for(Person person : identities){
            if(person.getDni() == dni){
                return person;
            }
        }
        return null;
    }

    private boolean hasAgeRequired (Date datePerson) {
        return (YEAR_CURRENT - datePerson.getYear()) >= AGE_REQUIRED;
    }

    private int hasNetSalaryRequired (PersonIdentity pIdentity){
        float salary = pIdentity.getNetSalary();
        if(salary > 30000 && salary < 40000){
            return 80000;
        }
        if(salary < 60000){
            return 120000;
        }
        if(salary < 80000){
            return 140000;
        }
        return 0;
    }

    public String personMeetRequirements (Person person, PersonIdentity pIdentity) {
        if(person == null){ // Usar un try/catch
            return "ERROR no se pudo encontrar la persona";
        }
        completeIdentities();
        if ( hasAgeRequired(person.getBirthDate())){
            if ( hasNetSalaryRequired(pIdentity) != 0){
                return LOAN_GRANTED;
            }
            else {
                return LOAN_DENIED_SALARY;
            }
        }
        return LOAN_DENIED_AGE;
    }
}
