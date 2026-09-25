package stringpack;

public class StringCreation {

	public static void main(String[] args) {
	// Literal way        - scp
	  String s = "Hai";
	
	  //Using new keyword   - heap
	  String s1 = new String("Hello");
	  String s2 = "Java";
	  char[] ch = {'s','t','r','i','n','g','s'};
	  String s3 = new String(ch);
	  
	  
	  //s= s.concat(" Kitty");// modify current value of s      s= hai kitty
	 // s.concat(" Friends");  // will not modify current value of s s= hai
	  System.out.println("s = "+s);
	  //System.out.println("s = "+(s.concat(" Dears!!!")));// value of s remain same
	  System.out.println("s1 = "+s1);
	  System.out.println("s2 = "+s2);
	  System.out.println("s3 = "+s3);
//	  s2.concat(s3);
//	  System.out.println("data = "+(s2+s3));
	  
	  
	}

}
