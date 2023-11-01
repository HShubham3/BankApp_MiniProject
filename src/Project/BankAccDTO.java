package Project;

public class BankAccDTO {
	
	private long accNum;
	private int pin=1234;
	private String accName;
	private int bal=0;
	
	public BankAccDTO(long accNum, String accName) {
		super();
		this.accNum = accNum;
		this.accName = accName;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	

}
