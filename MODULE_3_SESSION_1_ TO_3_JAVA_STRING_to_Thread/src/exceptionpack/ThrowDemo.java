package exceptionpack;

public class ThrowDemo {

	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("AGE IS NOT VALID");
		}else {
			System.out.println("You are Eligible to Vote");
		}
	}

	public static void main(String[] args) {
         
		    checkAge(2);
	}

}
