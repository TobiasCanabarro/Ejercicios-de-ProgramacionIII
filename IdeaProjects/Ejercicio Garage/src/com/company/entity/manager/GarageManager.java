package com.company.entity.manager;

import com.company.entity.Garage;
import com.company.entity.ParkedVehicle;
import com.company.entity.Vehicle;
import com.company.entity.enums.TypeGarage;
import com.company.entity.manager.cashing.Fixed;
import com.company.entity.manager.cashing.Mobile;

import java.util.List;

public class GarageManager {

    private static final int FIXED_MONT = 100;
    private static final int MAX_FIXED = 2;
    private static final int MAX_MOBILE = 4;
    private Garage garage;
    private int idAvailable = 0;

    public GarageManager (Garage garage){
        setGarage(garage);
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    private List<ParkedVehicle> getPalacesMobile (){
        return getGarage().getPalacesMobile();
    }

    private List<ParkedVehicle> getPalacesFixed(){
        return getGarage().getPalacesFixed();
    }

    private ParkedVehicle get (List<ParkedVehicle> parkedVehicle,int pos){
        return parkedVehicle.get(pos);
    }

    private int calculateCostVehicle(List<ParkedVehicle> parkedVehicles) {
        int acumCost = 0;
        for(int i = 0; i < parkedVehicles.size(); ++i){
            acumCost += (get(parkedVehicles, i).getCashing().getAmountHour() * FIXED_MONT) + get(parkedVehicles,i).getCashing().getAmountPlus();
        }
        return acumCost;
    }

    private ParkedVehicle searchVehicle (Vehicle vehicle, List<ParkedVehicle> parkedVehicles){
        for (ParkedVehicle parkedVehicle : parkedVehicles){
            if(parkedVehicle.getProprietor().getDni() == vehicle.getProprietor().getDni()){
                return parkedVehicle;
            }
        }
        return null;
    }

    public void addVehicle (Vehicle vehicle, int quantityHour,TypeGarage typeGarage){

        vehicle.setId(++idAvailable);
        if(typeGarage.equals(TypeGarage.MOBILE) && getPalacesMobile().size() < MAX_MOBILE){
            getPalacesMobile().add(new ParkedVehicle(vehicle, typeGarage, new Mobile(quantityHour)));
        }
        else if(getPalacesFixed().size() < MAX_FIXED){
            getPalacesFixed().add(new ParkedVehicle(vehicle, typeGarage, new Fixed(quantityHour)));
        }
    }

    public int occupiedSpace () {
        return getGarage().getPalacesFixed().size() + getGarage().getPalacesMobile().size();
    }


    public void removeVehicle(Vehicle vehicle){
       ParkedVehicle parkedVehicle = searchVehicle(vehicle, getPalacesMobile());

       if(parkedVehicle != null){
           getPalacesMobile().remove(parkedVehicle);
       }
       else {
            getPalacesFixed().remove( searchVehicle(vehicle, getPalacesFixed()) );
        }
    }

    public int calculateTotalCost(){
        return calculateCostVehicle(getPalacesFixed()) + calculateCostVehicle(getPalacesMobile());
    }
}
