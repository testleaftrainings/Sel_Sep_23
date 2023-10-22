package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnTohover {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[2]"));
		
		WebElement jackets = driver.findElement(By.xpath("(//ul[@class='desktop-navBlock']/li/a[text()='Jackets'])[1]"));
		
		Actions act=new Actions(driver);
	    act.scrollToElement(men).click(men).perform();
		
		//to do hover
		//act.moveToElement(men).click(jackets).perform();
		//to scroll
		
	         act.scrollByAmount(0, -500).perform();
		
		
		

	}

}
