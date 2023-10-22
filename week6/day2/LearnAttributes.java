package testcase;

import org.testng.annotations.Test;

public class LearnAttributes {

	@Test//(invocationCount=3)
	public void createLead() {
		System.out.println("Create Lead");
		throw new RuntimeException("Check the inputs");
	}

	@Test(priority=1,timeOut=200)
	public void editLead() {
		System.out.println("Edit Lead");
	}

	@Test(priority=2)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}

	@Test(priority=-3,enabled=false)
	public void mergeLead() {
		System.out.println("Merge Lead");
	}
	
	
	@Test(dependsOnMethods= {"createLead"},alwaysRun=true)
	public void duplicateLead() {
		System.out.println("DuplicateLead");
	}
	

}
