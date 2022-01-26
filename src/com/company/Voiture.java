package com.company;

public class Voiture extends Vehicule{


    @Override
    public void rouler() {
        System.out.println("La voiture roule");
    }

    @Override
    public Strategy getStrategy() {
        return new VoitureStrategy();
    }
}
