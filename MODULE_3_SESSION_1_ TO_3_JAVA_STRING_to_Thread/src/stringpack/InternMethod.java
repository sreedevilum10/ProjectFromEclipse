package stringpack;

public class InternMethod {

    @Override
    public String toString() {
    	
    	return super.toString();
    }
	public static void main(String[] args) {
		 String s = new String("hello");
		 String snew = "Hello";
		 String s2 = s.intern();
		 
		 System.out.println(s2 == snew);
	}

}
