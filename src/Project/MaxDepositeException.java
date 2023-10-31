package Project;

class MaxDepositeException extends Exception{
public String getMessage() {
return "Deposit Amount cannot be more than 10000";
}
}

