package com.company.enity;

public class BattleShip extends Offensive {
    private int armor;

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Armor : " + getArmor();
    }
}
