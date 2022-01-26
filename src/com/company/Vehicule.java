package com.company;

public abstract class Vehicule implements VehiculeInterface {
    @Override
    public void demarrer() {
        System.out.println("Le véhicule démarre");
    }

    @Override
    public void stopper() {
        System.out.println("Le véhicule stoppe");
    }

}
