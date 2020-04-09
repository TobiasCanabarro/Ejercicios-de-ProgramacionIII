package edu.utn;

import edu.utn.entity.Item;

public abstract class Electronic  extends Item {
    private int voltage;

    public Electronic(String description) {
        super(description);
    }


    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }
}
