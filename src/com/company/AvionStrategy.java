package com.company;

public class AvionStrategy implements Strategy{
    @Override
    public void buildRoute() {
        System.out.println("Calcul itinéraire avion");
    }
}
