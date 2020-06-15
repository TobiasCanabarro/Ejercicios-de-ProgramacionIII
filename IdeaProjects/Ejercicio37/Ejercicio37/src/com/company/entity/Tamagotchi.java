package com.company.entity;

import com.company.entity.states.Boring;
import com.company.entity.states.Happy;
import com.company.entity.states.Hungry;

import java.util.Timer;
import java.util.TimerTask;

public class Tamagotchi implements State{

    private static final int INITIAL_HAPPY = 10;
    private static final int BORING_MAX = 15000;
    private static final int UNIT_INCREMENT_HAPPY = 2;
    private static final int HUNGRY_MAX = 20000;
    private State state;
    private Timer timer;
    private int happiness;

    public Tamagotchi (){
        setState(new Hungry());
        setHappiness(INITIAL_HAPPY);
        setTimer(new Timer());
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setTamagotchi(this);
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happy) {
        this.happiness = happy;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public int levelHappiness (){
        return getHappiness();
    }

    @Override
    public void eat() {
        getState().eat();
        getTimer().schedule(new TimerTask() {
            @Override
            public void run() {
                Tamagotchi.this.setState(new Hungry());
                System.out.println("Me agarro hambre!!!");
            }
        },HUNGRY_MAX );
    }

    @Override
    public void play() {
        getState().play();
        getTimer().schedule(new TimerTask() {
            @Override
            public void run() {
                Tamagotchi.this.setState(new Boring());
                setHappiness( levelHappiness() - UNIT_INCREMENT_HAPPY);
            }
        },BORING_MAX );
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {

    }

    public void stateActual (){// Temporal
        System.out.println(getState().getClass());
    }
}
