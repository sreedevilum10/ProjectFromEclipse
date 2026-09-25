package stringpack;

import java.util.StringTokenizer;

public class StringTokenDemo {

	public static void main(String[] args) {
		String s = "The best meetings are the ones you're fully engaged in."
				+ " But that can come at a cost: forgetting to take notes. "
				+ "Never lose ideas, action items, or momentum again, "
				+ "with My Notes — available for most meeting platforms.";
		
		//StringTokenizer st = new StringTokenizer(s);
		StringTokenizer st = new StringTokenizer(s,".");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.countTokens());
	}

}
