package com.company;

import com.company.entity.Person;
import com.company.entity.PersonIdentity;
import com.company.manager.MinistryInterior;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //PersonIdentity pIdentity = new PersonIdentity(1, 20, 30000f);
        //PersonIdentity pIdentity = new PersonIdentity(2, 10, 15000f);
         //PersonIdentity pIdentity = new PersonIdentity(3, 5, 7500f);
        PersonIdentity pIdentity = new PersonIdentity(4, 2, 100000f);


        MinistryInterior ministry = new MinistryInterior(0,0,0f);
        ministry.completeIdentities();
        Person person = ministry.getInfo(pIdentity.getDni());
        System.out.println( ministry.personMeetRequirements(person,pIdentity) );

    }
}
