
public class EncapsulationDemo {

	private int ssn;
	private String empName;
	private int empAge;
	
	public int getEmpssn() {
		return ssn;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	
	public void setEmpssn(int newValue) {
		this.getEmpssn();
	}
	public void setEmpName(String newValue) {
		this.empName=newValue;
	}
	public void  setEmpAge(int newValue) {
		this.empAge=newValue;
	}
}
