package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod{
	
		
	public CreateLeadPage clickcreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
	
	
	public Findleads clickfindsLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new Findleads();
	}
	
	

}
