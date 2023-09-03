package com.itsupport.models;

public class Employee {
	String firstName,lastName;
	public Employee(String firstName,String lastName) {
		// TODO Auto-generated constructor stub
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}

}
