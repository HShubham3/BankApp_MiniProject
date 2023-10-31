package Project;

class MiniDepositException extends Exception{
public String getMessage() {
return "Deposit Amount cannot be less than 1";
}
}

