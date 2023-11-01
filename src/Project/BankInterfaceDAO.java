package Project;

public interface BankInterfaceDAO {

	void deposit(BankAccDTO ref); //Insertion
	void withdrawl(BankAccDTO ref);//Read
	void checkBal(BankAccDTO ref);//Read
	boolean updatePin(BankAccDTO ref);//Updating
	boolean validate(BankAccDTO ref);//verification
	void choice();//options
	
}
