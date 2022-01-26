package com.company;

public class VoitureStrategy implements Strategy {
    @Override
    public void buildRoute() {
        System.out.println("Calcul itinéraire voiture");
    }
}
