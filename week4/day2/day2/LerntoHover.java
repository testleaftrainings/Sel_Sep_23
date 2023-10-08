package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LerntoHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		
		WebElement men = driver.findElement(By.linkText("MEN"));
		
		//Instatiate the Actions class
		Actions builder=new Actions(driver);
		//hover on the webelement
		builder.moveToElement(men).perform();
		
		
		
		
	}

}
