package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranFrames {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(0); //index starts with zero		
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().defaultContent(); //takes the driver out of all the frames to the main content of the webpage
		
		//Second Clickme  webelement
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2"); //frame(0) --> as it the child of frame 2//Attribute of iframe Element
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
	//	driver.switchTo().parentFrame();
		
		WebElement frameEle = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(frameEle);
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
	}

}
