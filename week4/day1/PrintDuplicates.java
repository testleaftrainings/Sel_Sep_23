package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
int[] arr= {2,3,3,4,5,6,7,2};
		
		//Empty set
		Set<Integer> unique=new LinkedHashSet<Integer>();
		Set<Integer> dupValues=new LinkedHashSet<Integer>();

		for(int i=0;i<=arr.length-1;i++) {			
			boolean add = unique.add(arr[i]);//2,3
			if(!add) {
				dupValues.add(arr[i]);//3
			}
				}
		
		System.out.println(unique);
		System.out.println(dupValues);
		

	}

}
