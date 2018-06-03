package com.java.inter;

public class Main {
	public static void printProfile(IMyinfo profile){
		profile.myBasicInfo();
		profile.myHobies();
	}
	public static void main(String args[]){
		IMyinfo a=new  Divyaprofile();
		Main.printProfile(a);
}
}