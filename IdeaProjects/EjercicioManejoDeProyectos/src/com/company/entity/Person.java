package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int idProject;
    private List<Task> tasks;

    public Person(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void add(Task task){
        if(tasks == null){
            tasks = new ArrayList<>();
        }
        tasks.add(task);
    }

}
