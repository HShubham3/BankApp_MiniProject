package Project;

class MinWithdrawalException extends Exception{
public String getMessage() {
return "withdrawal Amount cannot be less than 100";
}
}

