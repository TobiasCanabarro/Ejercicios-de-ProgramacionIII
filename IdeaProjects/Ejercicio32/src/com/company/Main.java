package com.company;

import com.company.entity.Family;
import com.company.entity.Parent;
import com.company.entity.Son;

public class Main {
    public final static String ID_FAMILY_FIND = "20CB";

    public static void main(String[] args) {

        Family grandmother = new Parent ("Rosa", "Diaz", 1911);
        Family grandfather = new Parent ("Carlos", "Bianchi", 1920);

        Family mather = new Parent("Juana", "De arco", 1980);
        Family father = new Parent("Jorge", "Bianchi", 1975);

        Family me = new Son ("Pablo", "Bianchi", 1998);

        father.add(grandmother);
        father.add(grandfather);

        me.add(mather);
        me.add(father);

        Family familyFound = father.search(ID_FAMILY_FIND);

        System.out.println(familyFound.identification());

    }
}
