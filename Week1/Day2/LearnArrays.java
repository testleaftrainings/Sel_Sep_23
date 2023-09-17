package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//datatype[] varName = {value1, value2, value3};
		 int[] scores = {95, 97, 100, 89, 99, 76, 85};
		 	//index 	  0   1   2    3   4   5   6
		 	//length	  1   2   3    4   5   6   7
		 
		 //To find the length of an Array
	//	 System.out.println(scores.length);
		 int lengthOfArray = scores.length; //To store the value in a local variable,
		 				// use ctrl+2, L
		 System.out.println(lengthOfArray);
		 
			/*
			 * System.out.println(scores[0]+" "+ scores[1]); System.out.println(scores[1]);
			 * System.out.println(scores[2]);
			 */
		 //To sort an Array
		Arrays.sort(scores);
	
		 //To print all the values -> for loop
		 for (int i = lengthOfArray-1; i >= 0 ; i--) {
			//i = 7-1 
			System.out.println(scores[i]);
		}
		 
		 

	}

}
