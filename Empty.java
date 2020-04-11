package ArrayLists;

import java.util.ArrayList;

public class Empty {

	public static void main(String[]args) {
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("RED");
		c1.add("GREEN");
		c1.add("YELLOW");
		c1.add("BLACK");
		c1.add("WHITE");
		
		System.out.println("Original array list: "+c1);
		c1.removeAll(c1);
	    System.out.println("Array list after removing all elements "+c1);
	}
}
