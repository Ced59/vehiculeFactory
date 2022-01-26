package com.company;

public class Main {

    public static void main(String[] args) {

        VehiculeFactory factory1 = new VehiculeFactory("avion");
        Travel travelPlane = new Travel(factory1.generate());
        travelPlane.processTravel();

        Navigation navPlane = new Navigation();
        navPlane.setStrategy(travelPlane.getVehicule().getStrategy());
        navPlane.calcItinerate();

        VehiculeFactory factory2 = new VehiculeFactory("voiture");
        Travel travelCar = new Travel(factory2.generate());
        travelCar.processTravel();

        Navigation navCar = new Navigation();
        navCar.setStrategy(travelCar.getVehicule().getStrategy());
        navCar.calcItinerate();

    }
}
