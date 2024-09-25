package sep_24Bank;

public class BankAccount implements Bank {

	private long accountNumber;
	private double balance;

	@Override
	public void deposit(double amount) throws InvalidAmountException {

		if (amount <= 0) {
			throw new InvalidAmountException("Amount is less than is equal to zero");
		} else {
			balance += amount;
			System.out.println("You amount is deposit ");
		}

	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {

		if (amount >= balance) {
			throw new InsufficientFundsException(" amount is less than withdraw balance to zero.");
		} else if (amount <= balance) {
			throw new InvalidAmountException("Amount is less than is equal to zero");
		} else {
			balance -= amount;
		}

	}

	@Override
	public void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException {

		if (amount >= balance) {
			throw new InsufficientFundsException("Insufficient fund ");
		} else if (toAccount == null) {
			throw new AccountNotFoundException("Account not found");
		} else {
              toAccount.balance=amount;
              System.out.println("Amount is succesfully transfer");
		}
	}

	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Invalid amount");
		} else if (amount >= 50000) {
			throw new LoanNotAllowedException("Loan Not allowed for You");
		} else {
			System.out.println("Loan is allowed ");
		}

	}

	@Override
	public double getBalance() {

		return balance;
	}

}
