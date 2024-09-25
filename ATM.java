package sep_24Bank;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {

		BankAccount bank = new BankAccount();
		Scanner sc = new Scanner(System.in);
		int amount = 0;

		do {
			System.out.println("Select an Option: ");
			System.out.println(
					"\t\t1.Deposit\n\t\t2.Withdraw\n\t\t3.Transfer\n\t\t4.Loan Application\n\t\t5.Check Balance\n\t\t6.Exit");
			System.out.println("Enter Your Option: ");
			int n = sc.nextInt();

			switch (n) {

			case 1: {
				System.out.println("Enter amount to Depost: ");
				amount = sc.nextInt();
				try {

					bank.deposit(amount);
					System.out.println(bank.getBalance());
				} catch (InvalidAmountException e) {
					System.out.println(e.getMessage());

				}
			}
				break;
			case 2:{
				System.out.println("Enter amount to   ");
				amount = sc.nextInt();
				try {

					bank.deposit(amount);
					System.out.println(bank.getBalance());
				} catch (InvalidAmountException e) {
					System.out.println(e.getMessage());

				}
			}
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:System.exit(0);
				break;

			default:
				System.out.println("Wrong Input Entered ");
			}

		} while (1 != 0);

	}
}
