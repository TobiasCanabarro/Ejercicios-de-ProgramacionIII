package com.company.entity.enums;

public enum TypeProject {
    SPATIAL("SPATIAL"), AGRONOMIST("AGRONOMIST"), SCHOOL("SCHOOL"), ETC("ETC");

    private String typeProject;

    TypeProject(String typeProject) {
        setTypeProject(typeProject);
    }

    public String getTypeProject() {
        return typeProject;
    }

    public void setTypeProject(String typeProject) {
        this.typeProject = typeProject;
    }
}
