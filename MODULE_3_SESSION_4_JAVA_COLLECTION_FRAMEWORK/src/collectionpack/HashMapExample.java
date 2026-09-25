package collectionpack;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
	public static void main(String[] args) {
		int idNumber;
		String name;
		char choice;
// declare the HashMap
		HashMap<Integer, String> mapStudent = new HashMap<>();
		boolean loopAgain = true;
		Scanner scan = new Scanner(System.in);

									// loop do ..while
		do {
									// ask for user input for id number
			System.out.print("Enter ID number:");
			idNumber = scan.nextInt();
									// ask for user input which corresponds to student name
			System.out.print("Enter Name:");
			name = scan.next();
									// add the key value pair from user input to the HashMap
			mapStudent.put(idNumber, name);
									// ask user to check if another entry is required
			System.out.print("Enter another student (y/n)?");
			choice = scan.next().charAt(0);
									// condition to satisfy in order to loop again
			if ((choice == 'y') || (choice == 'Y')) {
				continue;
			} else {
				break;
			}
		} while (loopAgain);
		scan.close();
		System.out.println("\n**********************************");
		System.out.println("The following students are in database");
		System.out.println(" ID " + " Name");
		for (int id : mapStudent.keySet()) {
// printing key and its related value by get(key)
			System.out.println(" " + id + " " + mapStudent.get(id));
		}
		System.out.println("\n**********************************");
	}
}