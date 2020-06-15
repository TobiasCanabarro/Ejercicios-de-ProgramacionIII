package com.company;

import com.company.entity.BankStaff;
import com.company.entity.Employee;
import com.company.entity.Manager;
import com.company.entity.Supervisor;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Supervisor supervisor = new Supervisor(manager);
        Employee employee = new Employee(supervisor);

        employee.loanRequest(-10000);


    }
}
