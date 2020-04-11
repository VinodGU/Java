package Abstrcat;

public class Circle extends Shape{

	public double getArea(double radius) {
		return Math.PI*radius*radius;
	}
	public double getPerimeter(double radius) {
		return 2*Math.PI*radius;
	}
	public String getColor() {
		return "blue";
	}
}
