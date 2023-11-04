package Project;

import java.util.*;

public class Bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to The Bank");
	    System.out.println("*********************");
		System.out.println("Enter the account number: ");
		long anum=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the name: ");
		String name=sc.next();
		BankAccDTO b = new BankAccDTO(anum,name);
		
		BankInterfaceDAO bi = BankFactory.getInstance();
		
		boolean status=bi.validate(b);
		
		int option=0;
		
		while(status) {
			while(option<=4 && status==true) {
				bi.choice();
				option = sc.nextInt();
				 
				switch(option) {
				
				case 1: bi.deposit(b);
					break;
				
				case 2: bi.withdrawl(b);
					break;
					
				case 3: bi.checkBal(b);
					break;
					
				case 4: status = bi.updatePin(b);
					break;
				 
				}
			}
			break;	
		}
		
		if(!status) {
			System.out.println("Contact the bank");
		}
		sc.close();
		System.out.println("=*=*=*=*=*=Thank You! Visit again*=*=*=*=*=");
	}

}
