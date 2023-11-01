package Project;
import java.util.*;

public class Bank_ImpDAO implements BankInterfaceDAO {
	
	Scanner sc =new Scanner(System.in);
	 

	@Override //Depositing a money
	public void deposit(BankAccDTO ref) {
		
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
		
		
		
		return true;
	}

	@Override //validating/verifying a pin
	public boolean validate(BankAccDTO ref) {
		
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
