
public class Animal {
	private static boolean vegeterian;
	private static String eats;
	private static int noOfLegs;
	
public Animal(boolean veg,String food,int legs) {
	this.vegeterian=veg;
	this.eats=food;
	this.noOfLegs=legs;
   }
  public static boolean isVegeterian() {
	  return vegeterian;
  }
  public void setVegeterian(boolean vegeterian) {
	  this.vegeterian=vegeterian;
  }
  public static String getEats() {
	  return eats;
  }
  public  void setEats(String eats) {
	  this.eats=eats;
  }
  public static int getnoOfLegs() {
	return noOfLegs;  
  }
  public  void setNoOfLegs(int  noOfLegs) {
	  this.noOfLegs=noOfLegs;
  }
}
