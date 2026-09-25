package programsss;

public class CharFrequency {

	public static void main(String[] args) {
		String s = "malayalam";

		for(int i = 0; i< s.length() ;i++) {
			int count = 1;
			boolean charfound = false;
			
			for(int j = 0; j< i ;j++){
			  if(s.charAt(i) == s.charAt(j)) {
				  charfound = true;
				  break;
			  }	
			}
		
			if(charfound) 
				continue;
				for(int j = i+1; j< s.length() ;j++){
					  if(s.charAt(i)== s.charAt(j)) {
						  count++;
					  }	
					}
		System.out.println("Frequncy of "+s.charAt(i)+ " is "+count);
		}	
			
	}
}
