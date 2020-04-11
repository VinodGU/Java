package April2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class MainInterfaces {

public static void main(String[] args) {
		
		
		
		List<String> products = new ArrayList<>();
		
		products.add("Shirt");
		products.add("Pants");
		products.add("Skirt");
		products.add("Hat");		
		
		//added this address just to include it in the person objects,
		//but the focus of this exercise is the Collections.sort.
		Address fakeAddress = new Address("Awesome street","1A","111-11","Awesome City","Awesome Country"); 
		
		Person francisco = new Person("Francisco", 1843, "id_1", fakeAddress); //creating an object.				
		Person beyonce = new Person("Beyonce", 1982, "id_2", fakeAddress); //creating an object.
		Person merkel = new Person("Merkel",1953, "id_3", fakeAddress);

		//based on age: Beyonce, Merkel, Francisco
		
		List<Person> people = new ArrayList<>();
		
		people.add(francisco);
		people.add(beyonce);
		people.add(merkel);
		
		System.out.println(people);
		
		System.out.println(people);
		
		
	}
}
