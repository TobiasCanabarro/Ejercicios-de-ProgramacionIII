package com.company.entity.aircondition;

public abstract class AirCondition {

    private boolean cold;
    private boolean hot;

    public boolean isCold() {
        return cold;
    }

    public void setCold(boolean cold) {
        this.cold = cold;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public String features () {
        return "Cold : " + isCold() + " Hot : " + isHot();
    }
}
