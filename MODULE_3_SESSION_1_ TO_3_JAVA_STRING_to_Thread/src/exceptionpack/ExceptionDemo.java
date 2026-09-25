package exceptionpack;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int result = 50 / 0;
			System.out.println("Result = " + result);
		} catch (ArithmeticException e) {
             e.printStackTrace(); 
			//System.out.println(e);
		}
		System.out.println("Thank You");

	}
}
