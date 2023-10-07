package week4.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.axisbank.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		
		
	}

}
