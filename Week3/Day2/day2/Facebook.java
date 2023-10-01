package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));		
		int size = allLinks.size();
		System.out.println(size);
		
		String text = allLinks.get(2).getText();
		System.out.println(text);
		
		for(int i=0;i<=allLinks.size();i++) {		
		String text2 = allLinks.get(i).getText();
		System.out.println(text2);
		}

	}

}
