package com.tnsif.staticprograms;

public class Myclass {
	private int section;//instance variable
	
	private static int srno;//static variable
	static {
		
		System.out.println("Static block");
		srno=1000;
		
	}
	
	
	static void display() {
		System.out.println("Static method");
		
		srno++;
	}
   
	Myclass(){
		System.out.println("Default Constructor");
		srno++;
		section++;
	}
	void hello() {
		srno++;
		section++;
	}

	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	
	

}
