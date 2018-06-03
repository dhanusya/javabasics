package com.java.inter;

public class Divyaprofile implements IMyinfo{
	String firstName;
	String lastName;
	int age;
	String hobbies;
	@Override
	public void myBasicInfo() {
		System.out.println("divya");

		System.out.println("dd");		
		System.out.println(20);
		
	}
	@Override
	public void myHobies() {
		hobbies="Reading";
		System.out.println(hobbies);
		
		
	}
	
}

