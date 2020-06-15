package com.company.entity;

public class Supervisor extends BankStaff {

    private static final int MAX_AMOUNT = 40000;

    public Supervisor(BankStaff bankStaff){
        super(bankStaff);
    }
    public Supervisor(){

    }

    @Override
    public void loanRequest(int quantity) {
        if(quantity <= MAX_AMOUNT){
            System.out.println("El Supervisor aprueba el credito de $"+ quantity);
        }
        else if(getBankStaff()!=null){
            getBankStaff().loanRequest(quantity);
        }

    }
}
