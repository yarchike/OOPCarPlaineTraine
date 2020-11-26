package com.company;

public class Plaine extends Transport {
    public Plaine(int speed){
        super(speed);
    }

    @Override
    public void act() {
        System.out.println("Летит");
    }
}
