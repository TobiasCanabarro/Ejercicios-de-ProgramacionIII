package com.company.enums;

public enum FPType {
    NO_HUMAN("No Human"), HUMAN ("Human");

    private String type;

    FPType (String type){
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
