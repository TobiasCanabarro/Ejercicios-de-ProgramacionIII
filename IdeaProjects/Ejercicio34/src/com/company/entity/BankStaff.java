package com.company.entity;

import java.awt.image.BandCombineOp;

public abstract class BankStaff {
    private BankStaff bankStaff;
    private int maxQuantity;

    public BankStaff(BankStaff bankStaff){
        this.bankStaff= bankStaff;
    }

    public BankStaff(){

    }

    public BankStaff getBankStaff() {
        return bankStaff;
    }

    public void setBankStaff(BankStaff bankStaff) {
        this.bankStaff = bankStaff;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public abstract void loanRequest(int quantity);
}
