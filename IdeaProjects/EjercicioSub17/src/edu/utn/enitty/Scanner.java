package edu.utn.enitty;

public class Scanner {

    private void printItemInfo(Item item){
        System.out.println("Material : " + item.getMaterial());
        System.out.println("Volume : " + item.getVolume());
    }

    public void performScan(Item item){
        printItemInfo(item);
        for(Item childItem : item.getItems()){
            performScan(childItem);
        }
    }
}
