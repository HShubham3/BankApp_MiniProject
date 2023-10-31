package Project;

class InvaildAmountException extends Exception{
public String getMessage() {
return "withdrawal Amount is more than bal, insufficient balance";
}
}

