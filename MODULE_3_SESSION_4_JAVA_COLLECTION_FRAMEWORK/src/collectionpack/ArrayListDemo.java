package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("Java");
		lst.add("Luminar");
		lst.add("Technolab");
		lst.add("Java");
		
		System.out.println(lst); // [Java, Luminar, Technolab]

		List<String> list = new ArrayList<String>();
		list.add("Android");// time complexity O(1)
		list.add("Flutter");
		list.add("Kochi");
        
		lst.addAll(2,list);//time complexity O(n)
		System.out.println(lst.contains("Android"));
		lst.removeIf((data)-> data.endsWith("r"));
		System.out.println(lst.get(5));// O(1)
		lst.remove(4);//O(n)
		System.out.println(lst);
	}
}
