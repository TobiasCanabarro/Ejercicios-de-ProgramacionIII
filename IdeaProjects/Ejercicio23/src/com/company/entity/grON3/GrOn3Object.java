package com.company.entity.grON3;

public class GrOn3Object {

    private String size;
    private String type;
    private String kind;

    public GrOn3Object(String size, String type, String kind){
        setSize(size);
        setType(type);
        setKind(kind);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
