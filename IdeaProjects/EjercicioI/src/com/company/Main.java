package com.company;

import com.company.entity.Motocycle;
import com.company.entity.Toaster;
import com.company.entity.Turnable;
import com.company.entity.WashingMachine;
import com.company.entity.adapter.AdapterMotocycle;
import com.company.entity.adapter.AdapterToaster;
import com.company.entity.adapter.AdapterWashingMachine;

public class Main {

    public static void main(String[] args) {

        Motocycle motocycle = new Motocycle("RCZ 200");
        Toaster toaster = new Toaster("ToasterMaster 2000");
        WashingMachine washingMachine = new WashingMachine("Kohinoor");

        Turnable adapterMotocycle = new AdapterMotocycle(motocycle);
        Turnable adapterToaster = new AdapterToaster(toaster);
        Turnable adapterWashingMachine = new AdapterWashingMachine(washingMachine);

        adapterMotocycle.turnOn();
        adapterToaster.turnOn();
        adapterWashingMachine.turnOn();

    }
}
