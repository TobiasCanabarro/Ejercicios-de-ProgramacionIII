package com.company.entity;

import com.company.entity.enums.TypeProject;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private List<Person> partakers;
    private TypeProject typeProject;
    private Register register; // se usa para registras las cantidad de horas trabajas por personas
    private int idAvailable;

    public Project (){
        setRegister(new Register());
    }

    public List<Person> getPartakers() {
        return partakers;
    }

    public void setPartakers(List<Person> partakers) {
        this.partakers = partakers;
    }

    public TypeProject getTypeProject() {
        return typeProject;
    }

    public void setTypeProject(TypeProject typeProject) {
        this.typeProject = typeProject;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public void add (Person person){
        if(partakers == null){
            partakers = new ArrayList<>();
        }
        person.setIdProject(++idAvailable);
        partakers.add(person);
    }
}
