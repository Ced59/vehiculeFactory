package com.company;

public class Avion extends Vehicule{

    @Override
    public void rouler() {
        System.out.println("L'avion vole");
    }

    @Override
    public void stopper() {
        System.out.println("L'avion atterri");
    }

    public Strategy getStrategy(){
        return new AvionStrategy();
    }
}
