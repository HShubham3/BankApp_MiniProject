package Project;

public class BankFactory {
	
	public static BankInterfaceDAO getInstance() {
		return new Bank_ImpDAO();
	}

}
