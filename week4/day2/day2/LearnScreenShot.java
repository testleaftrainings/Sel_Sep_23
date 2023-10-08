package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
	
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement flightLink = driver.findElement(By.linkText("FLIGHTS"));
		//To take screenshot of a single element
		File elesrc= flightLink.getScreenshotAs(OutputType.FILE);
		//empth file- path to save the screen shot
		File eledestn=new File("./snap/picele.png");
		FileUtils.copyFile(elesrc, eledestn);				
		flightLink.click();
		
		Set<String> handles= driver.getWindowHandles();
		List<String> uniqHan=new ArrayList<String>(handles);
		driver.switchTo().window(uniqHan.get(1));
		//TO take screenshot of complete WebPage
		
		//to take scrennshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		//empth file- path to save the screen shot
		File destn=new File("./snap/pic.png");
		FileUtils.copyFile(src, destn);				
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(uniqHan.get(0));
		driver.close();

		

	}

}
