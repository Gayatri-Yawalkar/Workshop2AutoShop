package com.bridgelabz.autoshop;
public class MyOwnAutoShop {
	public static void main(String[] args) {
		double price;
		Sedan sedan=new Sedan(300000,2);
		price=sedan.getSalePrice();
		System.out.println("Sedan Price="+price);
		Ford ford1=new Ford(200000,1000);
		price=ford1.getSalePrice();
		System.out.println("Ford1 Price="+price);
		Ford ford2=new Ford(100000,2000);
		price=ford2.getSalePrice();
		System.out.println("Ford2="+price);
		Car car=new Car(150000);
		price=car.getSalePrice();
		System.out.println("Car Price="+price);
	}
}
