package com.itsupport.createcredentials;

import java.util.Scanner;

import com.itsupport.services.CredentialService;

public class Main {

	public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner(System.in)) {
			
			
			CredentialService cs=new CredentialService();			
			
			System.out.println("Please Enter the Department from the following :");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			
			int choice=sc.nextInt();				
			
			switch (choice)
			{
			case 1:
				cs.showCredentials("tech");
				break;
				
			case 2:
				cs.showCredentials("admin");
				break;
			case 3:
				cs.showCredentials("hr");
				break;
			case 4:
				cs.showCredentials("legal");
				break;
			default:
				System.out.println("Invalid Choice, Please try again");
				break;
				
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
	}

}