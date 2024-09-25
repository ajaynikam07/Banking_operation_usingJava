package sep_24Bank;

public class InsufficientFundsException extends Exception {

	public InsufficientFundsException() {

	}

	public InsufficientFundsException(String message) {
		super(message);
	}
}

class InvalidAmountException extends Exception {

	public InvalidAmountException() {

	}

	public InvalidAmountException(String message) {
		super(message);
	}
}

class AccountNotFoundException extends Exception {

	public AccountNotFoundException() {

	}

	public AccountNotFoundException(String message) {
		super(message);
	}

}

class LoanNotAllowedException extends Exception {

	public LoanNotAllowedException() {

	}

	public LoanNotAllowedException(String message) {
		super(message);
	}
}