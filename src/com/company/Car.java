package com.company;

public class Car extends Transport {
    public Car(int speed){
        super(speed);
    }

    @Override
    public void act() {
        System.out.println("Едет");
    }
}
