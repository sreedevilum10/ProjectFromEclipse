package exceptionpack;

public class ExcDemoOne {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int result = 10 / 0;
			System.out.println(result);

			int[] array = { 1, 2, 3, 4, 5 };
			System.out.println(array[5]);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
//		try {
//			try {
//				int result = 10 / 0;
//				System.out.println(result);
//			} catch (ArithmeticException e) {
//				e.printStackTrace();
//			}
//			try {
//				int[] array = { 1, 2, 3, 4, 5 };
//				System.out.println(array[5]);
//
//			} catch (ArrayIndexOutOfBoundsException e) {
//				e.printStackTrace();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("Thank You");

	}

}
