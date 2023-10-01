package week3.day2;

public class SBI implements RBI,CIBILScore{	
//Concrete class
	
	public static void main(String[] args) {
		//cannot instantiate class/create object for a interface
		//RBI loan=new RBI();
		
		SBI loan =new SBI();
		loan.cibilScore();
		loan.kycDocument();
		loan.rateOfInterest();
	}

	public void kycDocument() {
	 System.out.println("PAN Number");
	 		
	}

	public void rateOfInterest() {
		System.out.println("8%");
		
	}

	public void cibilScore() {
		System.out.println("Clear document");
		
	}

	public void issuingCard() {
		System.out.println("Credit card is issued");
		
	}

	public void transaction() {
		System.out.println("Activated");
		
	}
	
}
