package collectionpack;

import java.util.Scanner;

interface EvenOrOdd {

	boolean find(int num);
}

public class EvenOrOddUsingLmbda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		EvenOrOdd evenOrOdd = (n)-> num%2 == 0;
		
		if(evenOrOdd.find(num)) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");

		}
	}
}
