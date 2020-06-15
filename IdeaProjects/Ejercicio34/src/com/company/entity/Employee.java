package com.company.entity;

public class Employee extends BankStaff {

    private static final int MAX_AMOUNT = 10000;

    public Employee(BankStaff bankStaff){
        super(bankStaff);
    }
    public Employee(){

    }

    @Override
    public void loanRequest(int quantity) {
        if(quantity <= MAX_AMOUNT){
            System.out.println("El empleado aprueba el credito de $"+ quantity);
        }
        else if(getBankStaff()!=null){
            getBankStaff().loanRequest(quantity);
        }
    }
}
