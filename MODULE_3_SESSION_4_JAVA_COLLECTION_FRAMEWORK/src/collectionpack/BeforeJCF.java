package collectionpack;

import java.util.Hashtable;
import java.util.Vector;

public class BeforeJCF {

	public static void main(String[] args) {

		// Array instance creation requires [],
		int arr[] = new int[] { 1, 2, 3, 4 };

		// while Vector and hash table require ()
		Vector<Integer> v = new Vector<Integer>();

		Hashtable<Integer, String> h = new Hashtable<Integer, String> ();

		// Vector element insertion requires addElement(),
		v.addElement(1);
		v.addElement(2);

		// Hashtable element insertion requires put()
		h.put(1, "luminar");
		h.put(2, "java");

		// Accessing Array elements are using []
		System.out.println(arr[0]);
		// vector elements using elementAt()
		System.out.println(v.elementAt(0));
		// hashtable elements using get()
		System.out.println(h.get(1));
	}
}
