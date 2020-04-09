package edu.utn.entity;

import edu.utn.Electronic;

public class Fridge extends Electronic {
    private boolean freezer;

    public Fridge(String description) {
        super(description);
    }

    public boolean isFreezer() {
        return freezer;
    }

    public void setFreezer(boolean freezer) {
        this.freezer = freezer;
    }
}
