package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		
		//Simple Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();	
		
		//Confirmation Dialog
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();
		String userClicked = driver.findElement(By.id("result")).getText();
		System.out.println(userClicked);
		
		
		//sweet alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		//alert.dismiss();
		//handle with normal click
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		
		
	}

}
