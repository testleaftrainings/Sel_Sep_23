package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] arr= {2,3,3,4,5,6,7,2};
		
		//Empty set
		Set<Integer> unique=new LinkedHashSet<Integer>();
		
		//addAll only to add one collection(list/set)into other other Collection(list/set)
		//iterate through each index of array and add it to the set
		for(int i=0;i<=arr.length-1;i++) {
			unique.add(arr[i]);
		}
		
		System.out.println(unique);
		
		

		for (Integer number : unique) {
			System.out.print(number);
		}
		
		
		
		String sentence ="Learning Java in week4 Java Session";
		String[] split = sentence.split(" ");
		
		
		Set<String> uniqueValues=new LinkedHashSet<String>();
		
		for(int i=0;i<=split.length-1;i++) {
			uniqueValues.add(split[i]);
		}
		
		System.out.println(uniqueValues);
		
		//To print the set element through iteration
		
		/*//not possible
		 * for(int i=0;i<=uniqueValues.size();i++) { uniqueValues.get }
		 */
		
		//Advanced for loop-for each
		
		for (String words : uniqueValues) {
			System.out.print(words +" ");
		}
		
		
		

	}

}
