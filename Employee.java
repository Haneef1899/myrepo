package com.tnsif.staticprograms;

public class Employee {
       private String name;
       private int id;
       static String companyName="TNSIF";
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
       
}
