package com.java.inter;

public class DhanusyaProfile  implements IMyinfo {
	String firstName;
	String lastName;
	int age;
	String hobbies;
	@Override
	public void myBasicInfo() {

		System.out.println(Constants.FIRST_NAME+"dhanusya");

		System.out.println(Constants.LAST_NAME+"devi");		
		System.out.println(Constants.AGE+"20");
		
	}
	@Override
	public void myHobies() {
		hobbies="Reading";
		System.out.println(hobbies);
		
		
	}
	
}

