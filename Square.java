package Abstrcat;

public class Square extends Shape{

	public double getArea(double side) {
		return side*side;
	}
	public double getPerimeter(double side) {
		return side*4;
	}
	public String getColor() {
		return "blue";
	}
}
