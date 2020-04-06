
public class Bear extends Animal {
	private static int weight;
	public Bear(boolean veg, String food, int legs) {
		super(veg, food, legs);
		this.setWeight(100);
	}
	public Bear(boolean veg, String food, int legs,int weight) {
		super(veg, food, legs);
		this.weight=weight;
	}
	public  static int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
