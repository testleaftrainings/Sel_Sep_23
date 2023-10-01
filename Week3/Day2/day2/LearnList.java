package week3.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
	
		List<String> mentors=new ArrayList<String>(); //empty list
		
		
		//to add into the list
		mentors.add("Aravind");
		mentors.add("Princila");
		mentors.add("Raghu");
		mentors.add("Subraja");
		
		System.out.println(mentors);
		
		mentors.add(3, "Jagadish");
		System.out.println(mentors);
		
		
		//to retreive the data from the list
		String ment = mentors.get(0); //index starts with zero
		System.out.println(ment);
		
		//to add the data into another list
		List<String> mentorsName=new ArrayList<String>();
		mentorsName.addAll(mentors);
		
		System.out.println(mentorsName);
		mentorsName.add("Michel");
		System.out.println(mentorsName);
		System.out.println(mentors);
		
		//length of the list-number of elements
		System.out.println(mentors.size());
		
		// to remove the data from the list
		mentors.remove("Michel");
		System.out.println(mentors);
		
		//to retreive the index of value
		int indexOf = mentors.indexOf("Princila");
		System.out.println(indexOf);
		
		
		boolean contains = mentors.contains("Michel");
		System.out.println(contains);
		
		//to remove the element in comparision other list
		mentors.removeAll(mentorsName);
		System.out.println(mentors);
		System.out.println(mentorsName);
		
		boolean empty = mentors.isEmpty();
		System.out.println(empty);
		/*
		 * //to remove all the data from the list mentorsName.clear();
		 * System.out.println(mentorsName);
		 */
		
		Object[] array = mentorsName.toArray();
		System.out.println(array); //{"Aravind" ,"Princila","Subraja"}
		
	for (int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
		
	}
		
		
		
		

	}

}
