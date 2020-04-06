
public class InheritanceMain {

	public static void main(String[]args) {
		
		Cat cat =new Cat(false,"milk",4,"black");
		
		System.out.println("Cat is vegeterian ? "+cat.isVegeterian());
		System.out.println("Cat eats "+cat.getEats());
		System.out.println("Cat has "+cat.getnoOfLegs());
		System.out.println("Cat color is "+cat.getColor());
		
		Bear bear =new Bear(true,"Plants",4,100);
		
		System.out.println("Bear is vegeterian ? "+Bear.isVegeterian());
		System.out.println("Bear eats "+Bear.getEats());
		System.out.println("Bear has "+Bear.getnoOfLegs());
		System.out.println("Bear weight is "+Bear.getWeight());
	}
}
