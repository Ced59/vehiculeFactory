package com.company;

public class Travel {
    private VehiculeInterface vehicule;


    public Travel(VehiculeInterface vehicule){
        this.vehicule = vehicule;
    }

    public void processTravel(){
        this.vehicule.demarrer();
        this.vehicule.rouler();
        this.vehicule.stopper();
    }

    public VehiculeInterface getVehicule() {
        return vehicule;
    }
}
