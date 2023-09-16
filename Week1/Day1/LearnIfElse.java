package week1.day1;

public class LearnIfElse {

	public static void main(String[] args) {
		
		int number = 0;
		//condition
		if(number > 0) {//10>0 --> false
			
			System.out.println("The number is positive");
			
		}else if(number<0) {
			
			System.out.println("The number is negative");
			
		
		}
		else
			System.out.println("The number is neutral");
		//System.err.println("The number is neutral");
	}

	}
