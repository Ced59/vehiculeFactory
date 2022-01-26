package com.company;

public class Navigation {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void calcItinerate(){
        strategy.buildRoute();
    }
}
