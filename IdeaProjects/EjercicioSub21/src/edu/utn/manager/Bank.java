package edu.utn.manager;

import edu.utn.entity.Customer;
import edu.utn.entity.Person;
import edu.utn.validator.CustomerValidator;
import edu.utn.validator.PersonIdentity;


public class Bank {
    private void creditAnalysis (Customer customer){
        CustomerValidator validator = new CustomerValidator();
        if(!validator.isValid(customer)){
            //manejar el error: por ejemplo, guardarlo en una lista
        }
        Person person = PersonIdentity.getInfo(customer.getId());
    }
}
