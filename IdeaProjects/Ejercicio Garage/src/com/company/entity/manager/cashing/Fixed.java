package com.company.entity.manager.cashing;

public class Fixed extends Cashing{

    private static final int PLUS = 10;

    public Fixed (int amountHour){
        setAmountHour(amountHour);
        setAmountPlus(PLUS);
    }
}
