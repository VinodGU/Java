package April2;

public class MainAddreaa {

public static void main(String[] args) {
		
		//before
		/*
		Person francisco = new Person("Francisco", 1843, "id_1"); //creating an object.				
		Person beyonce = new Person("Beyonce", 1982, "id_2"); //creating an object.
		Person merkel = new Person("Merkel",1953, "id_3");
		*/
		
		Person francisco = new Person("Francisco", 1843, "id_1", "Crappy street","42E","222-22","Crappy City","Crappy country"); //creating an object.				
		Person beyonce = new Person("Beyonce", 1982, "id_2", "Awesome street","1A","111-11","Awesome City","Awesome Country"); //creating an object.
		Person merkel = new Person("Merkel",1953, "id_3", "Awesome street","1B","111-11","Awesome City","Awesome Country");
		
		
		System.out.println(francisco.getName());
		System.out.println(francisco.getCountry());
		System.out.println(francisco.getZipCode());

		System.out.println(beyonce.getName());
		System.out.println(beyonce.getCountry());
		
	}
}
