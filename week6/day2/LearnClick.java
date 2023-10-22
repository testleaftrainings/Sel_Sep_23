package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnClick {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement customers = driver.findElement(By.xpath("//span[text()='Customers']"));
	
		Actions act=new Actions(driver);
		act.contextClick(customers).perform();
		
		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		WebElement message = driver.findElement(By.xpath("//label[text()='Message']"));
		
		act.doubleClick(message).perform();
	
	}

}
