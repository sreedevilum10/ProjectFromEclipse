package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeAndFailFast {
	public static void main(String[] args) {
		//************ NO EXCEPTION SINCE WE USED CopyOnWriteArrayList WITH FOR-EACH *************

//		CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<String>();
//		courses.add("Java");
//		courses.add("Spring");
//		courses.add("Hibernate");
//
//		for (String s : courses) {
//			if (s.equals("Hibernate")) {
//				courses.remove(s);     -> this will throw exception
//			}
//		}	
//		System.out.println(courses);
	
		
//		*********** NO EXCEPTION SINCE WE USED NORMAL FORLOOP INDEXWISE ACCESS ***********
		ArrayList<String> courses = new ArrayList<String>();
		for (int i = 0; i <= courses.size(); i++) {
			if (courses.get(i).equals("Hibernate")) {
				courses.remove(i);
			}
		}
		System.out.println(courses);

//		*********** NO EXCEPTION SINCE WE USED ITERATOR ***********
//		ArrayList<String> coursess = new ArrayList<String>();
//		Iterator<String> iterator = coursess.iterator();
//		while (iterator.hasNext()) {
//			if (iterator.next().equals("Hibernate")) {
//				iterator.remove(); // will not throw Exception

// If you remove an element via Iterator remove() method, exception will not be thrown.
//			}
//		}
//		System.out.println(coursess); // [Java, Spring]
	}
}
