package Project;

import java.util.*;

public class Bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to The Bank");
	    System.out.println("*********************");
		
		System.out.println("Enter the new account number to created: ");
		long anum=sc.nextLong();
		System.out.println("Enter the name: ");
		String name=sc.next();
		BankAccDTO b = new BankAccDTO(anum,name);
		
		BankInterfaceDAO bi = BankFactory.getInstance();
		
		boolean status=bi.validate(b);
		
		int ch=0;
		
		while(status) {
			while(ch<=4 && status==true) {
				bi.choice();
				ch = sc.nextInt();
				 
				switch(ch) {
				
				case 1: bi.deposit(b);
					break;
				
				case 2: bi.withdrawl(b);
					break;
					
				case 3: bi.checkBal(b);
					break;
					
				case 4: bi.updatePin(b);
					break;
				 
				}//switch
				
			}//inner while
			
			break;
			
		}//outer while
		
		if(!status) {
			System.out.println("Contact the bank");
		}
		
		System.out.println("=*=*=*=*=*=Thank You! Visit again*=*=*=*=*=");
	}//main

}//Bank
