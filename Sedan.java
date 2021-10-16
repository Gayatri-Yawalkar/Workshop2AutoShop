package com.bridgelabz.autoshop;
public class Sedan extends Car {
	int length;
	public Sedan(double regularPrice,int length) {
		super(regularPrice);
		this.length=length;
	}
	public double getSalePrice() {
		double price;
		if(length>20) {
			price=super.getSalePrice()-(5*super.getSalePrice()/100);
		} else {
			price=super.getSalePrice()-(10*super.getSalePrice()/100);
		}
		return price;
	}
}
