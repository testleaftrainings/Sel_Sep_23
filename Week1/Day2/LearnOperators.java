package week1.day2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LearnOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input1 = 50;
		int input2 = 10;
		//addition
		int sum = input1 + input2; // Add two numbers
		//Subtraction
		int sub = input1 - input2; //Subtract two numbers
		//Multiplication
		int mul = input1 * input2; //Multiply two numbers
		//Divison
		int div = input1 / input2; // Quotient = 5
		//Modulus 
			// 50 % 10 --> 50 / 10 -> Q = 5, R = 0
		int mod = input1 % input2; // Remainder = 0
		
		/*
		 * System.out.println(sum); System.out.println(sub); System.out.println(mul);
		 * System.out.println(div); System.out.println(mod);
		 */
		/*
		 * System.out.println(input1); System.out.println(input1++);//input1 =
		 * input1+1->50+1 System.out.println(input1);
		 */
		System.out.println(input1);
		System.out.println(++input1);
		System.out.println(input1);
		System.out.println(++input1);//51+1= 52
		System.out.println(input1);//52

	}

}
