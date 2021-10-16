package com.bridgelabz.autoshop;
public class Car {
	int speed;
	double regularPrice;
	String color;
	public Car(double regularPrice) {
		this.regularPrice=regularPrice;
	}
    public double getSalePrice() {
    	return regularPrice;
    }
}
