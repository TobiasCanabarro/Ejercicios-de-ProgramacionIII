package edu.utn.entity;

import edu.utn.Electronic;

public class Tv extends Electronic {
    private boolean claver;
    private int screenType;

    public Tv(String description) {
        super(description);
    }

    public boolean isClaver() {
        return claver;
    }

    public void setClaver(boolean claver) {
        this.claver = claver;
    }

    public int getScreenType() {
        return screenType;
    }

    public void setScreenType(int screenType) {
        this.screenType = screenType;
    }
}
