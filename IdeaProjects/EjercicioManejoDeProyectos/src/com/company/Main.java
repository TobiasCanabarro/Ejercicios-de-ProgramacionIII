package com.company;

import com.company.entity.Person;
import com.company.entity.Project;
import com.company.entity.RegisterPerson;
import com.company.entity.Task;
import com.company.entity.enums.TypeTask;
import com.company.entity.manager.ProjectManager;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(TypeTask.STUDY));
        tasks.add(new Task(TypeTask.LAUNCH_NAVE));
        tasks.add(new Task(TypeTask.PLANT));
        tasks.add(new Task(TypeTask.ETC));

        Person tobias = new Person("tobias");
        Person pablo = new Person ("pablo");
        Person roberto = new Person("roberto");

        Project project = new Project();
        project.add(tobias);
        project.add(pablo);
        project.add(roberto);

        ProjectManager projectManager = new ProjectManager(project);
        projectManager.assignTaskToPerson(tobias, tasks.get(0));
        projectManager.assignTaskToPerson(pablo, tasks.get(1));
        projectManager.assignTaskToPerson(roberto, tasks.get(2));

        projectManager.registerPersonInProject(new RegisterPerson(tobias, 2));
        projectManager.registerPersonInProject(new RegisterPerson(pablo, 4));
        projectManager.registerPersonInProject(new RegisterPerson(roberto, 6));

        projectManager.completeTask(tobias, tasks.get(0));

        System.out.println("Las personas que estan actualmente colaborando con en el proyecto son : ");
        projectManager.peopleCollaboratedInProject();

        System.out.println(projectManager.numberPeopleWorkProject());

        projectManager.pendingTask(tasks);
        System.out.println("Numero de horas trabajadas en el proyecto : " + projectManager.numberHoursWorkedInProject());
    }
}
