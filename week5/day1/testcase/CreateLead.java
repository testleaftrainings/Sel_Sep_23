package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{
	
	@Test //mandatory annotation to execute the testcase
	public  void runCreate() {		
		System.out.println(Thread.currentThread().getId());
		
		driver.findElement(By.linkText("Creat Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		
}
}






