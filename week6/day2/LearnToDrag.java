package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToDrag {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement draggable = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		int x = draggable.getLocation().getX();
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(draggable, x+100, 0).perform();

		WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));

		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));

		act.dragAndDrop(source, target).perform();
	}

}
