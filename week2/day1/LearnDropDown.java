package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
		
		//To handle the dropdown element  ->ctrl 2 l /ctrl 1 
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd=new Select(source);		
		dd.selectByIndex(3);
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select inddd=new Select(industry);
		inddd.selectByValue("IND_HARDWARE");
		inddd.selectByVisibleText("Finance");
		
		
		

	}

}
