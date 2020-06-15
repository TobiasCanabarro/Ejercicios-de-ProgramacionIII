package edu.utn.entity;

public class Article {
    /*
     * observation : no es obligatorio;
     */

    private String name;
    private String observation;
    private int productionCost;
    private int saleCost; // se le setea en la lista correspondiente
    private TypeSale typeSale; //min o may

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public int getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(int productionCost) {
        this.productionCost = productionCost;
    }

    public int getSaleCost() {
        return saleCost;
    }

    public void setSaleCost(int saleCost) {
        this.saleCost = saleCost;
    }

    public TypeSale getTypeSale() {
        return typeSale;
    }

    public void setTypeSale(TypeSale typeSale) {
        this.typeSale = typeSale;
    }

    public String feature (){
        return "Name : " + getName() + " Production Cost : " + getProductionCost() + " Type sale  : " + getTypeSale() + " Observation : " + getObservation();
    }
}
