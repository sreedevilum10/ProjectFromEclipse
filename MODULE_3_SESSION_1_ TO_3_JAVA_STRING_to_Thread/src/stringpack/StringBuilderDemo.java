package stringpack;

public class StringBuilderDemo {

	public static void main(String[] args) {

		String s = new String("Hello Welcome to Luminar");
		
//		StringBuilder sb = new StringBuilder("Hello Luminar ");
//		
		s.concat(" Students...");
//		sb.append(" Luminar......");
//		
//		System.out.println("s  : " + s);
//		System.out.println("sb : " + sb);
//		System.out.println(sb.capacity()); 
//		sb.append(" Thrissur");
//		System.out.println("capacity after 2026 append "+sb.capacity());
//		System.out.println(sb.charAt(4));
//		System.out.println(sb.insert(6," Kochi"));
		
		//default 16 
		// if we have value inside constructor
		//initial capacity will be 16+(string length)
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello luminar sdfghjklfghjkl"); 
		System.out.println("StringBuffer capacity : " + sb.capacity());
		//sb.delete(0, 6);
		System.out.println("sb :" + sb);
		
		System.out.println(s.substring(15));
		System.out.println(s.substring(0,6));

	}
}
// new capacity = (oldcap*2)+2 
