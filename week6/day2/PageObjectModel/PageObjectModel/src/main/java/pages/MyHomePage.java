package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	
	
	public LeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage();
	}
	
	public AccountsPage clickAccounts() {
		driver.findElement(By.linkText("Leads")).click();
		return new AccountsPage();
	}

}
