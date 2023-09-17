package week1.day2;

public class BiCycle {
	
	/*
	 * brandName
	 * colour
	 * countOfCycles 
	 * isGearAvailable
	 * cycleModel
	 * yearPurchased
	 * price
	 * 
	 */
	//Access Specifier Return Type	Method Name
	//methodName starts with lowercase -> camelCase
	//Access Specifier -> defines the scope of a method to be visible
	// either within the same class, or same package, or different packages
	private             void         brandName() {
		System.out.println("Hercules");

	}
	
	public void cycleColour() {
		
		System.out.println("Blue");
	}
	
	public void cycleCount() {
		System.out.println("2");

	}
	
	void cycleLogo() {
		
		System.out.println("H");
		
	}
	
	
	
	  public static void main(String[] args) {
	  
	  //ClassName objectName = new ClassName(); 
		  //objectName starts with lowercase - camelCase
	  
	  BiCycle cycle = new BiCycle(); 
	  cycle.brandName(); 
	  cycle.cycleColour();
	  cycle.cycleCount();
	  cycle.cycleLogo();
	  
	  }
	 
}
