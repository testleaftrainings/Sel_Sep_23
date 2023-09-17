package week1.day2;

public class LearnSwitchCase {
	
	public static void main(String[] args) {
		
		String browser = "Opera";
		
		switch(browser) {
		
		case "Edge":
			System.out.println("Launch Edge browser");
			//break - it will the terminate the execution and comes
			//out of your loop
			break;
		
		case "FireFox":
			System.out.println("Launch Firefox browser");
			break;
			
		case "Chrome":
			System.out.println("Launch Chrome browser");
			break;
			
		case "Safari":
			System.out.println("Launch Safari browser");
			break;
			
/*		default:
			System.out.println("Launch default browser");
			break;*/
		}
		int a =10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
	}

}
