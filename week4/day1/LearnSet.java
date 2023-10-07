package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> mentors =new HashSet<String>();//Random Order
		
		mentors.add("Subraja");
		mentors.add("Princila");
		mentors.add("Aravind");
		mentors.add("Raghu");
		mentors.add("Subraja");
		
		System.out.println(mentors);
		
		
		Set<Object> mentorName=new LinkedHashSet<Object>(); 
		//insertion Order
		
		mentorName.add("Subraja");
		mentorName.add("Aravind");
		mentorName.add("Raghu");
		System.out.println(mentorName);
		
		
		Set<String>mentor=new TreeSet<String>(mentors);
		//ASCII Order
		System.out.println(mentor);
		
		List<String> s=new ArrayList<String>(mentor);
		System.out.println(s.get(2));
		
		
		
	}

}
