package com.company.entity;

import com.company.entity.enums.TypeTask;

public class Task {
    private boolean pendingTask;
    private boolean isAssign;
    private TypeTask typeTask;

    public Task (TypeTask typeTask){
        setPendingTask(true);
        setAssign(false);
        setTypeTask(typeTask);
    }

    public boolean isPendingTask() {
        return pendingTask;
    }

    public void setPendingTask(boolean pendingTask) {
        this.pendingTask = pendingTask;
    }

    public TypeTask getTypeTask() {
        return typeTask;
    }

    public void setTypeTask(TypeTask typeTask) {
        this.typeTask = typeTask;
    }

    public boolean isAssign() {
        return isAssign;
    }

    public void setAssign(boolean assign) {
        isAssign = assign;
    }
}
