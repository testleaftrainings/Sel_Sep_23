package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		price.get(2).click();
		System.out.println(driver.getTitle());
		
		String windowHandle = driver.getWindowHandle(); //current window/tab address
		System.out.println(windowHandle);
		
		//to get the address of all windows opened by the parent 
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		for (String address : windowHandles) {
			System.out.println(address);
		}
		
		//Convert the set to list
		List<String> winHan=new ArrayList<String>(windowHandles);		
		driver.switchTo().window(winHan.get(1));
		System.out.println(driver.getTitle());
		//getting back to the parent window
		driver.switchTo().window(winHan.get(0));
		
		price.get(3).click(); //control is still in parent 
		
		//size of the window/tab are changed		
		Set<String> handles= driver.getWindowHandles();
		System.out.println(handles.size());
		System.out.println(handles);
		List<String> uniqHan=new ArrayList<String>(handles);
		driver.switchTo().window(uniqHan.get(2));
		//System.out.println(driver.getTitle());
		/*driver.close();
		driver.switchTo().window(uniqHan.get(0));
		driver.switchTo().window(uniqHan.get(2));	*/	
		
		//how to close all the child windows except the parent
		for(int i=0;i<=uniqHan.size()-1;i++) {
			driver.switchTo().window(uniqHan.get(i));
			System.out.println(driver.getTitle());
			driver.close();
		}
			
		driver.quit();//closes all the child windows and parent also 
		
		
		
		
		
		
		
	

	}

}
