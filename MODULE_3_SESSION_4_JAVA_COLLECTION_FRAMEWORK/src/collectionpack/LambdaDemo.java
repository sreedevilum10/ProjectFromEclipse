package collectionpack;

interface Demo { // functional interface
	// void show();
	int sum(int a, int b);
}

public class LambdaDemo {

	public static void main(String[] args) {
		// override method using anonymous inner class
//		Demo obj = new Demo() {	
//			@Override
//			public void show() {
//				System.out.println("Show Method");
//			}
//		};
		
//      using Lambda - default function without return type
		
//		Demo obj = ()-> System.out.println("Show Method"); 
//		obj.show();

//      using Lambda - parameterized function with return type
		Demo obj = (a, b) -> a + b;
		System.out.println(obj.sum(100, 23));

	}

}
