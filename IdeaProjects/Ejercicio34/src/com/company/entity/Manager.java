package com.company.entity;

public class Manager extends BankStaff {

    private static final int MAX_AMOUNT = 120000;

    public Manager(BankStaff bankStaff){
        super(bankStaff);
    }
    public Manager(){

    }

    @Override
    public void loanRequest(int quantity) {
        if(quantity <= MAX_AMOUNT){
            System.out.println("El Gerente aprueba el credito de $"+ quantity);
        }
        else if(quantity>MAX_AMOUNT){
            System.out.println("No se puede solicitar el monto");
        }
        else if(getBankStaff()!=null){
            getBankStaff().loanRequest(quantity);
        }
    }
}
