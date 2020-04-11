package April2;

public class Person {


	private String name;
	private int birthYear;
	private String SSN;
	private Address address;

	public final static int CURRENT_YEAR = 2018;

	public Person(String name, int birthYear, String ssn, 
			String streetName, String streetNumber, String zipCode, String city, String country) {
		
		this.address = new Address(streetName, streetNumber, zipCode, city, country);
		
		this.name = name;
		this.birthYear = birthYear;
		this.SSN = ssn;
	}
	
	//An alternative with composition. This could violate the Creator a bit,
	// since it would be the Person's responsibility to create the address
	public Person(String name, int birthYear, String ssn, Address address) {
		this.name = name;
		this.birthYear = birthYear;
		this.SSN = ssn;
		this.address = address;
	}

	public String getCountry() {
		return this.address.getCountry();
	}
	
	public String getZipCode() {
		return this.address.getZipCode();
	}
	
	public int getAge() {
		int age = CURRENT_YEAR - birthYear;
		return age;
	}

	/*
	 * public int compareTo(Person otherPerson) { if(this.getAge() <
	 * otherPerson.getAge()) { return -1; }else if(this.getAge() ==
	 * otherPerson.getAge()) { return 0; }else { //if this.getAge() >
	 * otherPerson.getAge(); return 1; } }
	 */

	// new feature, sort them by name:	
	public int compareTo(Person otherPerson) {
		
		//Double.compare(d1, d2)
		//  price 1 = 0.6;
		//  price 2 = 0.78;
		//  price1 - price2 = -5.49;
		// return this.getPrice() - otherCar.getPrice();
		// is it safe???
		
		// This below is not needed. its already implemented on class String
		/*
		 * char firstLetterMe = this.getName().charAt(0);
		 * 
		 * char firstLetterOther = otherPerson.getName().charAt(0);
		 * 
		 * if(firstLetterMe < firstLetterOther) { return -1;
		 * 
		 * }else if(firstLetterMe == firstLetterOther) { char secondLetterMe =
		 * this.getName().charAt(1); char secondLetterOther =
		 * otherPerson.getName().charAt(1);
		 * 
		 * }
		 */
		String myName = this.getName();
		String otherPersonName = otherPerson.getName();
		return myName.compareTo(otherPersonName);
	}

	//Exercise: Make it comparable by both name and age.
	
	
	public String toString() {
		String result = this.name + " is " + getAge() + " years old.";
		return result;
	}

	public String getName() {
		return name;
	}

	public String getSSN() {
		return this.SSN;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public int getBirthYear() {
		return this.birthYear;
	}
}
