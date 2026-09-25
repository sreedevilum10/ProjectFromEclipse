package exceptionpack;

public class Bankk {
	int balance;

	public void deposit(int amount) throws ArithmeticException {
		if (amount >= 500) {
			balance += amount;
			System.out.println("Balance after deposit = " + balance);
		} else {
			throw new ArithmeticException("Invalid Amount");
		}

	}

	public void withdraw(int amount, String pin) throws ArithmeticException, IllegalArgumentException {
		if (pin.length() != 4) {
			throw new IllegalArgumentException("Invalid Pin");
		} else {
			if (amount > balance) {
				throw new ArithmeticException("Amount should be less than or = balance");
			} else {
				balance -= amount;
				System.out.println("Balance after withdrawal = " + balance);
			}
		}
	}

	public static void main(String[] args) {
		Bankk bank = new Bankk();
		try {
			bank.deposit(50);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("For more information Contact Us!!!!!!!");
		}
		try {
			bank.withdraw(2000, "1234");
		} catch (ArithmeticException | IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

}
