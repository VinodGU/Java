
public class EncapTest {
	public static void main(String[]args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpName("Mario");
		obj.setEmpAge(22);
		obj.setEmpssn(112233);
		
		System.out.println("Employee name "+obj.getEmpName());
		System.out.println("Employee age "+obj.getEmpAge());
		System.out.println("Employee ssn"+obj.getEmpssn());
	}
}
