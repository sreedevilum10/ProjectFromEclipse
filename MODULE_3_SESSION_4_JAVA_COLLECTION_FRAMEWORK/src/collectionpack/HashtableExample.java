package collectionpack;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Book {
	String bookName;
	String authorName;
	float bookPrice;

	public Book(String bookName, String authorName, float bookPrice) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
	}
}

public class HashtableExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bookId;
		String bookName;
		String authorName;
		float bookPrice;
		
		char choice;
		
		Map<Integer, Book> map = new Hashtable<Integer, Book>();
		
		do {
// Creating Books ----1
// ask for user input for book id
			System.out.print("Enter Book Id");
			bookId = scan.nextInt();
//use scan.nextLine(); to remove the left over the newline character in the buffer. 
//This clears the buffer, allowing the subsequent nextLine() method to correctly read the input valuescan.nextLine();
// or
// bookId=Integer.parseInt(scan.nextLine()); // remove the cursor after id input
// ask for user input which corresponds to Book name
			System.out.print("Enter Book Name:");
			bookName = scan.nextLine();
// ask for user input which corresponds to author
			System.out.print("Enter Author Name:");
			authorName = scan.nextLine();
// ask for user input for Price
			System.out.print("Enter Book Price");
			bookPrice = scan.nextFloat();
			map.put(bookId, new Book(bookName, authorName, bookPrice));
// ask user to check if another entry is required
			System.out.print("Enter another book (y/n)?");
			choice = scan.next().charAt(0);
// condition to satisfy in order to loop again
			if ((choice == 'y') || (choice == 'Y')) {
				continue;
			} else {
				break;
			}
		} while (true);
		
// Traversing map 
//		Iterator<Map.Entry<Integer, Book>> iterator = map.entrySet().iterator();
//		while(iterator.hasNext()) {
//			Map.Entry<Integer, Book> entry =iterator.next();
//			int key = entry.getKey();
//			Book book = entry.getValue();
//			System.out.println(key + " Details:");
//			System.out.println(book.bookName + " " + book.authorName + " " + book.bookPrice);
//		}
		
		for (Map.Entry<Integer, Book> entry : map.entrySet()) {
			int key = entry.getKey();
			Book book = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(book.bookName + " " + book.authorName + " " + book.bookPrice);
		}
	}
}