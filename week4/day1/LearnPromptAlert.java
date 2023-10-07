package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click on the prompt alert button
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		Alert alert = driver.switchTo().alert();
				alert.sendKeys("Vidya");
		alert.accept();
		
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);
		
	}

}
