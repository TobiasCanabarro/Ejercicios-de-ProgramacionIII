package com.company.entity.mp3;

public abstract class Mp3 {

    private boolean miniPlug;
    private boolean bluetooth;

    public boolean isMiniPlug() {
        return miniPlug;
    }

    public void setMiniPlug(boolean miniPlug) {
        this.miniPlug = miniPlug;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String feature (){
        return "Miniplug : " + isMiniPlug() + "Bluetooh : " + isBluetooth();
    }
}
