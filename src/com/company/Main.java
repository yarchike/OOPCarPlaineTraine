package com.company;

public class Main {

    public static void main(String[] args) {
	Car car = new Car(130);
	Plaine plaine = new Plaine(800);
	Traine traine = new Traine(80);

	car.act();
	plaine.act();
	traine.act();
    }
}
