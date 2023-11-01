package Project;
import java.util.*;

public class Bank_ImpDAO implements BankInterfaceDAO {
	
	Scanner sc =new Scanner(System.in);
	 

	@Override //Depositing a money
	public void deposit(BankAccDTO ref) {
		System.out.println("Enter amount to be deposited");
		int amtd = sc.nextInt();
		
		try {
			if(amtd>10000) {
				throw new MaxDepositeException();
			}
			else if(amtd<1) {
				throw new MiniDepositException();
				
			}
			else {
				amtd=amtd+ref.getBal();
				ref.setBal(amtd);
			}
			
		}
		catch(MaxDepositeException e) {
			System.out.println(e.getMessage());
		}
		catch(MiniDepositException e){
			System.out.println(e.getMessage());
		}	
	}

	@Override//withdrawing a money
	public void withdrawl(BankAccDTO ref) {
		 System.out.println("Enter amount to be withdrawled");
		 int amtw;
		 amtw=sc.nextInt();
		 try {
			 if(amtw>ref.getBal()) {
				 throw new InvaildAmountException();
			 }
			 else if(amtw<100) {
				throw new MinWithdrawalException();
			 }
			 else {
				 amtw = ref.getBal()-amtw;
				 ref.setBal(amtw);
			 }
			 
		 }
		 catch(InvaildAmountException e) {
			 System.out.println(e.getMessage());
		 }
		 catch(MinWithdrawalException e) {
			 System.out.println(e.getMessage());
		 }
		
	}

	@Override //Checking balance
	public void checkBal(BankAccDTO ref) {
		
		System.out.println("Account Holder Name:"+ref.getAccName()
						+"\nAccount Number: "+ref.getAccNum()
						+"\nCurrent Balance: "+ref.getBal());
		
	}

	@Override //for updating pin
	public boolean updatePin(BankAccDTO ref) {
		
		System.out.println("Enter the account number");
		long accno=sc.nextLong();
		try {
			if(accno == ref.getAccNum()) {
				System.out.println("Enter old pin");
				int oldpin=sc.nextInt();
				if(oldpin==ref.getPin()){
					System.out.println("Enter new pin to upadate");
					int newpin = sc.nextInt();
					ref.setPin(newpin);
					return validate(ref);
				}
				
				else {
					throw new InvaildOldPinException();
				}
			}
			else {
				throw new InvalidAccountException();
			}
			
		}
		catch(InvalidAccountException e){
			System.out.println(e.getMessage());
		}
		
		catch(InvaildOldPinException e){
			System.out.println(e.getMessage());
		}
		
		
		return true;
	}

	@Override //validating/verifying a pin
	public boolean validate(BankAccDTO ref) {
		
//		boolean status=false;
		int count=3;
		while(count>0){
			System.out.println("enter the pin");
			int pin=sc.nextInt();
			if(pin == ref.getPin()) {
				return true;
			}
			else {
				try {
					count--;
					throw new InvaildPinException();
				}
				catch(InvaildPinException e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
		return false;
	}

	@Override // options given to choose
	public void choice() {

		System.out.println("Select the choice\n"
				+ "1:Deposit\n"
				+ "2:Withdrawal\n"
				+ "3:Check Balance\n"
				+ "4:Update PIN\n"
				+ "5:Exit\n");
	}
	
}
