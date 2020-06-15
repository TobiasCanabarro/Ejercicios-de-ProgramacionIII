package com.company.entity.states;

import com.company.entity.State;
import com.company.entity.Tamagotchi;

import java.util.Timer;
import java.util.TimerTask;

public class Boring implements State{

    private static final int BORING_MAX = 8000;
    private Tamagotchi tamagotchi;

    @Override
    public void eat() {
        System.out.printf("Estoy comiendo");
    }

    @Override
    public void play() {
        tamagotchi.setState(new Happy());
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
        Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Estaba aburrida, pero ahora me puse contenta.");
                    Boring.this.tamagotchi.setState(new Happy());
                }
            },BORING_MAX);
    }
}
