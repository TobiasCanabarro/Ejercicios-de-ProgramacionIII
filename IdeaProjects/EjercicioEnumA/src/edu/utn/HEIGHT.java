package edu.utn;

public enum HEIGHT {
    TALL("Tall"), LOW("LOW");

    private String height;

    HEIGHT(String height){
       setHeight(height);
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
