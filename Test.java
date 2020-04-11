package Abstrcat;

public class Test {

	public static void main(String[]args) {
		Square s = new Square();
		System.out.println(s.getArea(3));
		System.out.println(""+s.getPerimeter(6));
		System.out.println(""+s.getColor());
		
		Circle c = new Circle();
		System.out.println(c.getArea(5));
		System.out.println(c.getPerimeter(5));
		System.out.println(c.getColor());
	}
}
