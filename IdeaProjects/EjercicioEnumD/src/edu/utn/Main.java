package edu.utn;

import edu.utn.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person juan = new Person("Juan", "Gomez");
        Person pedro = new Person("Pedro", "Diaz");
        Person alejo = new Person("Alejo", "Martinez");

        List<Person> list = new ArrayList<>();
        list.add(juan);
        list.add(pedro);
        list.add(alejo);

        System.out.println("-------------------------------------");

        for (Person element : list){
            System.out.println(element.showDataPerson());
        }

        System.out.println("-------------------------------------");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).showDataPerson());
        }
    }
}
