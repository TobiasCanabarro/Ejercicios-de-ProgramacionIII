package com.company.entity.grON3;

public class GrON3 {

    private int id;
    private FlyingGr0n3 flyingGr0n3;

    public GrON3 (int id){
        setId(id);
        setFlyingGr0n3(new FlyingGr0n3(id));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FlyingGr0n3 getFlyingGr0n3() {
        return flyingGr0n3;
    }

    public void setFlyingGr0n3(FlyingGr0n3 flyingGr0n3) {
        this.flyingGr0n3 = flyingGr0n3;
    }
}
