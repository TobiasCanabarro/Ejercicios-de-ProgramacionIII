package com.company.entity.manager;

import com.company.entity.*;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {

    private Project project;

    public ProjectManager (Project project){
        setProject(project);
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    private String getTypeTask (Task task){
        return task.getTypeTask().getTypeTask();
    }

    private void personCompleteAllTaskInProject (Person person, int quantityTaskCompleted, List<Person> partakers){
        if(quantityTaskCompleted == person.getTasks().size()){
            partakers.remove(person);
        }
    }

    public void assignTaskToPerson (Person person, Task task){
        task.setAssign(true);
        person.add(task);
    }

    public List<Task> pendingTaskPerson (Person person){
       List<Task> pendingTasks = new ArrayList<>();
        for(Task task : person.getTasks()){
            if(task.isPendingTask()){
                pendingTasks.add(task);
            }
        }
        return pendingTasks;
    }

    public int numberPeopleWorkProject (){
        return getProject().getPartakers().size();
    }

    public void peopleCollaboratedInProject (){
        for (Person partaker : getProject().getPartakers()) {
            for(int i =0 ; i< partaker.getTasks().size(); ++i){
                if(partaker.getTasks().get(i).isPendingTask()){
                    System.out.println(partaker.getName());
                }
            }

        }
    }

    public void registerPersonInProject (RegisterPerson person){
        getProject().getRegister().add(person);
    }
    
    public void completeTask (Person person, Task taskCompleted){
        int quantityTaskCompleted = 0;
        for(Person partaker : getProject().getPartakers()){
            if(partaker.getIdProject() == person.getIdProject()){
               for(Task taskElement : partaker.getTasks()){
                   if(getTypeTask(taskElement).equals(getTypeTask(taskCompleted)) && quantityTaskCompleted < partaker.getTasks().size()){
                       taskElement.setPendingTask(false);
                       quantityTaskCompleted++;
                   }
               }
            }
        }
        personCompleteAllTaskInProject(person, quantityTaskCompleted, getProject().getPartakers());
    }

    public void pendingTask (List<Task> tasks){
        System.out.println("Tareas pendientes : ");
        for(Task task : tasks){
            if(!task.isAssign()){
                System.out.println(getTypeTask(task));
            }
        }
    }

    public int numberHoursWorkedInProject(){
        int totalHours = 0;
        for(RegisterPerson element : getProject().getRegister().getRegisteredPeople()){
            totalHours += element.getHoursWorked();
        }
        return totalHours;
    }
}
