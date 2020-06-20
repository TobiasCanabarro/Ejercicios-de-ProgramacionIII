package com.company.entity.enums;

public enum TypeTask {

    LAUNCH_NAVE("LAUNCH_NAVE"), PLANT("PLANT"), STUDY("STUDY"), ETC("ETC");

    private String typeTask;

    TypeTask(String typeTask) {
        setTypeTask(typeTask);
    }

    public String getTypeTask() {
        return typeTask;
    }

    public void setTypeTask(String typeTask) {
        this.typeTask = typeTask;
    }
}
