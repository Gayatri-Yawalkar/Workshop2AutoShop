package com.bridgelabz.autoshop;
public class Ford extends Car{
	int year;
	int manufacturerDiscount;
	public Ford(double regularPrice,int manufacturerDiscount) {
		super(regularPrice);
		this.manufacturerDiscount=manufacturerDiscount;
	}
	public double getSalePrice() {
		double price=super.getSalePrice()-manufacturerDiscount;
		return price;
	}
}
