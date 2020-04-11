package ArrayLists;

import java.util.ArrayList;

public class JoinLists {

	public static void main(String[]args) {
		ArrayList<String> c1 =new ArrayList<String>()	;
		c1.add("RED");
		c1.add("GREEN");
		c1.add("YELLOW");
		c1.add("BLACK");
		c1.add("WHITE");
	System.out.println("List of firstr array "+c1);
	
	ArrayList<String> c2 =new ArrayList<String>()	;
	 c2.add("RED");
	 c2.add("GREEN");
	 c2.add("YELLOW");
	 c2.add("BLACK");
	 c2.add("WHITE");
      System.out.println("List of firstr array "+c2);
      
      ArrayList<String>a = new ArrayList<String>();
      a.addAll(c1);
      a.addAll(c2);
      
      System.out.println(a);
	}
}
