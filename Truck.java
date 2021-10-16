package com.bridgelabz.autoshop;
public class Truck extends Car{
	int weight;
	public Truck(double regularPrice,int weight) {
		super(regularPrice);
	}
	public double getSalePrice() {
		double salePrice;
		if(weight>2000) {
			salePrice=super.getSalePrice()-(10*super.getSalePrice()/100);
		} else {
			salePrice=super.getSalePrice()-(20*super.getSalePrice()/100);
		}
		return salePrice;
	}
}
