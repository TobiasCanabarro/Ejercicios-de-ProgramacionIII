package edu.utn.entity;

public enum TypeSale {
    Minority ("Minority"), Wholesaler("Wholesaler");

    private String type;

    TypeSale (String type){
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
