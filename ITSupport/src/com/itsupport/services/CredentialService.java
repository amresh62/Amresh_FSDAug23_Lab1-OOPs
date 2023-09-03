package com.itsupport.services;

import java.util.Random;
import com.itsupport.interfaces.CredentialsInterface;
import com.itsupport.models.Employee;

public class CredentialService implements CredentialsInterface
{

	String department;
	Employee emp=new Employee("Amresh","Sinha");
	
	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?";

	    StringBuilder password = new StringBuilder();
	    Random rand = new Random();
	    for (int i = 0; i < 8; i++) { 
	        int randomIndex = rand.nextInt(characters.length());
	        password.append(characters.charAt(randomIndex));
	        }

	    return password.toString();
		
	}

	@Override
	public String generateEmailAddress() {
		// TODO Auto-generated method stub
		
		String email=emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+this.department.toLowerCase()+".mygreatlearning.com";
		   
		   return email;
	}

	@Override
	public void showCredentials(String dept) {
		// TODO Auto-generated method stub
		this.department=dept;
		String email=this.generateEmailAddress();
		String pwd=this.generatePassword();
		
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email ---> "+ email);
		System.out.println("Password ---> "+ pwd);
	}
	
}
