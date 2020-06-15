package com.company.entity.states;

import com.company.entity.State;
import com.company.entity.Tamagotchi;

import java.util.Timer;
import java.util.TimerTask;

public class Happy implements State{

    private static final int UNIT_INCREMENT_HAPPY = 2;
    private static final int MAX_TIME_HAPPY = 25000;
    private Tamagotchi tamagotchi;

    @Override
    public void eat() {
        System.out.println("Estoy comiendo :P");
    }

    @Override
    public void play() {
        System.out.println("Estoy jugando");
        tamagotchi.setHappiness( tamagotchi.getHappiness() + UNIT_INCREMENT_HAPPY);
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Happy.this.tamagotchi.setState(new Boring());
                System.out.println("Me aburri :( , podemos jugar a algo? porfa :S");
            }
        },MAX_TIME_HAPPY);
    }
}
