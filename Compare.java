package ArrayLists;

import java.util.ArrayList;

public class Compare {

	public static void main(String[]args) {
		ArrayList<String> c1= new ArrayList<String>();
		
		c1.add("RED");
		c1.add("GREEN");
		c1.add("YELLOW");
		c1.add("BLACK");
		c1.add("WHITE");
		
		ArrayList<String> c2= new ArrayList<String>();
		
		c1.add("RED");
		c1.add("GREEN");
		c1.add("YELLOW");
		c1.add("BLACK");
		
		ArrayList<String>c3 = new ArrayList<String>();
		for(String e : c1)
			c3.add(c2.contains(e)? "YES" : "NO");
		System.out.println(c3);
	}
}
