package exceptionpack;

class InvalidCredentials extends Exception {
	private static final long serialVersionUID = 1L;
	
	String s;

	public InvalidCredentials(String s) {
		super(s);
		this.s = s;
	}

	@Override
	public String toString() {
		return "Exception caught " + s;
	}
}

public class UserDefinedException {

	void validateUser(int otp) throws InvalidCredentials {
		if (otp != 1234) {
			throw new InvalidCredentials("Otp mismatch");
		} else {
			System.out.println("Login Success!!!!!!");
		}
	}

	public static void main(String[] args) {
		UserDefinedException definedException = new UserDefinedException();
		try {
			definedException.validateUser(1234);
		} catch (InvalidCredentials e) {

			e.printStackTrace();
		}
	}

}
