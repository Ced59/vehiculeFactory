package com.company;

public class VehiculeFactory {
    private String type;

    public VehiculeFactory(String type){
        this.type = type;
    }

    public VehiculeInterface generate(){
        return switch (type) {
            case "voiture" -> new Voiture();
            case "avion" -> new Avion();
            default -> null;
        };
    }
}
