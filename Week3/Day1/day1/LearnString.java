package week3.day1;

public class LearnString {

	public static void main(String[] args) {
	
		String name="Testleaf"; //Literal way
		//String pool memory
		String comPanyName="Testleaf";
		
		String comName=new String("Testleaf");// Using object
		
		String compNam=new String("Testleaf");
		
		//Heap memory
		
		if(name==comName) { // to compare the address of the variables
			System.out.println("Values are same");
		}
		else {
			System.out.println("Values are not same");
		}
		
		
		if(name.equals("Testleaf")) {//to compare the values of the string
			System.out.println("The content of the strings are same");
		}else{
			System.out.println("The content of the strings are not same");
		}
		
		
		
		if(name.equalsIgnoreCase("testleaf")) {
			System.out.println("Company names are same");
		}else {
			System.out.println("Company names are not same");
		}
		
		
		
		if(comName==compNam) {
			System.out.println("Contents are same");
			
		}else {
			System.out.println("Contents are not same");
		}
		
		
		//literal variables
		if(name==comPanyName) {
			System.out.println("Content are same");
		}else {
			System.out.println("Contents are not same");
		}

		
		name= name.concat("Software");//placed in new memory
		System.out.println(name);
		
		
		
	}

}
