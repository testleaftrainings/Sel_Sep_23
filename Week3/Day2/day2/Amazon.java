package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(price);
		List<Integer> priceList=new ArrayList<Integer>();
		
		for (int i = 0; i < price.size(); i++) {
			String text = price.get(i).getText();
		     String replaceAll = text.replaceAll(",","");
		     int parseInt = Integer.parseInt(replaceAll);
			priceList.add(parseInt);
		}
		
		System.out.println(priceList);
		
		  //to Sort the list
		Collections.sort(priceList);
		System.out.println(priceList);
		 Integer min = Collections.min(priceList);
		 System.out.println(min);
		
		
		
	
	}

	
	
		
		
		

	}
