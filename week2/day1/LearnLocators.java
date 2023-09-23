package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver driver =new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//To maximize the browser
		driver.manage().window().maximize();
		
		//to locate the username
		//driver-->findElement-->using id attribute -->value in ""
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//sendKeys -->to type in the textbox
		//to locate password
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//to locate the Login button
		
		driver.findElement(By.className("decorativeSubmit")).click();
		//click() -->click on the element
		
		//to click on the link -->with text
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on the Leads
		
		driver.findElement(By.linkText("Leads")).click();
		
		//verify the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		

	}

}
