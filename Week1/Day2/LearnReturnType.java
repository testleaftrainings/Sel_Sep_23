package week1.day2;

public class LearnReturnType {

	public void typeBreakfast(String name, String name1){
		
		System.out.println(name+","+ name1);
		
	}
	
	public void breakFastCount(int count){
		
		System.out.println(count);
	}
	public boolean hadBrakfast() {
		return true;
	}
	
	public String phoneName() {
		//System.out.println("iphone");
		return "iphone";

	}
	
	public static void main(String[] args) {
		
		LearnReturnType objReturn = new LearnReturnType();
		objReturn.typeBreakfast("Dosa", "Idly");
		objReturn.breakFastCount(2);
		System.out.println(objReturn.hadBrakfast());
		System.out.println(objReturn.phoneName());
		
		

	}

}
