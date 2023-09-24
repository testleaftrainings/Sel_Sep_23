package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //global wait
		                   //-->applicable on all findElement and findElements
		/*
		 * WebElement username = driver.findElement(By.id("username"));
		 * username.clear(); username.sendKeys("DemoSalesManager");
		 * driver.findElement(By.id("password")).sendKeys("crmsfa");
		 * driver.findElement(By.className("decorativeSubmit")).click();
		 */
				
		driver.findElement(By.xpath("(//input[@class='inputLogi'])")).sendKeys("demoSalesManager");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
	}

}
