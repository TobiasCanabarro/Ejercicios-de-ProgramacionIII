package com.company.entity;

public class Date {

    private int dd;
    private int mm;
    private int aa;

    public Date(int dd, int mm, int aa){
        setDd(dd);
        setMm(mm);
        setAa(aa);
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    public String showDate(){
        return String.valueOf(getDd()) + "/" + String.valueOf(getMm())+ "/" + String.valueOf(getAa());
    }
}
