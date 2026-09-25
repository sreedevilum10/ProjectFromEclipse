package regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExampleOne {
	public static void main(String args[]) {
//1st way 
		Pattern pattern = Pattern.compile(".s");// . represents single character
		Matcher matcher = pattern.matcher("&s"); // eg. As, 9s, #s, s(space is valid)
		boolean flagFirst = matcher.matches();

//2nd way 
		boolean flagSecond = Pattern.compile(".s").matcher("as").matches();

//3rd way 
		boolean flagThird = Pattern.matches(".s", "as");
//Pattern class contains matches 
//method that takes regex and input String as argument and return boolean result after 
//matching them. 

		System.out.println(flagFirst + "\n" + flagSecond + "\n" + flagThird);
	}
}