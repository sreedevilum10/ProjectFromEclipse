package collectionpack;

import java.util.Arrays;
import java.util.List;

public class CollectionUsingLambda {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40); // return of asList is ARRAYLIST Instance
		list.add(100);
		 
		list.forEach(num -> System.out.println(num));
		
//		for(int num : list) {
//			System.out.println(num);
//		}

	}

}
