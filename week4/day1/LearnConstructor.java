package week4.day1;

public class LearnConstructor {

	int empId;
	String empName;
	static String CompanyName;

	public LearnConstructor() { // default constructor
		this(11, "Sundindhar", "Wipro");
		System.out.println("From default Constructor");
	}

	public LearnConstructor(int empId, String empName, String CompanyName) {
		// Parametrized constructor
		// keyword this -->use to call the current class Constructor
		// LearnConstructor.LearnConstructor();
		// this();
		this.empId = empId;
		this.empName = empName;
		this.CompanyName = CompanyName;
		//System.out.println("From parmaetrized Constructor " + empId + ":" + empName + ":" + CompanyName);
	}

	public void empDetails() {
		System.out.println(empId + ":" + empName);
	}

	public void emp() {
		//this.empDetails();
		System.out.println(empId + ":" + empName +":"+CompanyName);
	}

	public static void main(String[] args) {

		LearnConstructor lc = new LearnConstructor();
		lc.emp();
		LearnConstructor lc1 = new LearnConstructor(12, "Sathish", "TCS");
		lc1.emp();
		lc.emp();
	}

}
