package week3.day1;

public class LearnStringMethods {

	public static void main(String[] args) {
		
		String name="Testleaf";
		int[] arr= {1,2,3,5};
		
		//to find the length-->number of characters in the string
		int length = name.length();
		System.out.println(length);
		
		//to get the one single characters from the String using index
		char charAt = name.charAt(0);//ndex always starts with zero
		System.out.println(charAt);
		
		
		//to reterive the characters from the string
			
		System.out.println();
		//to reverse the string -Method 1
		for(int i=length-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		
		//method:2 
		char[] ch = name.toCharArray();//convert the string character array -->T,e,s,t,l,e,a,f
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		
		
		
		
		
	
		
	}

}
