package com.inheritance;

public class Taxi extends Car {
	static int i=100;
	//ctrl+space for over
	@Override
	public void getSpeed() {
		super.getSpeed();
		System.out.println("Taxi class");
	}
	public static void main(String args[]){
		Car ab=new Taxi();
		ab.getSpeed();
		System.out.println(Car.i);
		System.out.println(ab instanceof Taxi);
		
	}
	
	

}
