package com.company.entity.states;

import com.company.entity.State;
import com.company.entity.Tamagotchi;

public class Hungry implements State{

    private Tamagotchi tamagotchi;

    @Override
    public void eat() {
        System.out.println("Estoy contenta :D");
        tamagotchi.setState(new Happy());
        tamagotchi.setHappiness( tamagotchi.getHappiness() + 1);
    }

    @Override
    public void play() {
        System.out.println("No puedo jugar estoy hambrienta :C");
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }
}
