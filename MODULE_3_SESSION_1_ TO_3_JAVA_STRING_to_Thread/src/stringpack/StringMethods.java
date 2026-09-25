package stringpack;

public class StringMethods {

	public static void main(String[] args) {
		String s = new String("Luminar Technolab");
		String s1 = new String("Luminar Technolab");
		
		String s2 = "Luminar Technolab";
		String s3 = "luminar Technolab ";

		
		System.out.println(s.charAt(8));
		System.out.println(s.codePointAt(5));
		System.out.println("==============compareTo// compare ascii value==================");
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println("==============equals // compare value not memory reference==================");
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s2.equals(s3));

		System.out.println("-------  (==) ompare memory reference not value ---------------");
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s2==s3);
		
		System.out.println(s1.endsWith("b"));
		System.out.println(s.equalsIgnoreCase(s3.trim()));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.length());
		
		String data[] = s.split(" ");
		for(String value : data) {
			System.out.println(value);
		}





		
	}

}
