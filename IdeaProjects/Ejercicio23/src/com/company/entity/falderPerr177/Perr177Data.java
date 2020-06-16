package com.company.entity.falderPerr177;

import com.company.enums.FPGender;
import com.company.enums.FPType;
import com.company.enums.Size;

public class Perr177Data {

    private FPType type;
    private Size size;
    private FPGender gender;

    public Perr177Data (FPType type, Size size, FPGender gender){
        setType(type);
        setSize(size);
        setGender(gender);
    }

    public FPType getType() {
        return type;
    }

    public void setType(FPType type) {
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public FPGender getGender() {
        return gender;
    }

    public void setGender(FPGender gender) {
        this.gender = gender;
    }
}
