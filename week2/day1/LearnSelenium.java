package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnSelenium {

	public static void main(String[] args) {
	//ctrl shift o to import the classes
		
		  //launch the browser
		   ChromeDriver driver =new ChromeDriver();
		
		   EdgeDriver dr=new EdgeDriver();
		  
		   //launch the application
		   driver.get("http://leaftaps.com/opentaps/control/login");
		   
		   //to close the browser
		   driver.close();
		

	}

}
