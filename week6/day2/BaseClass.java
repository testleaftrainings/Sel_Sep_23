package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	/*
	 * public ChromeDriver driver ; //global variable public EdgeDriver driver1;
	 */
	public RemoteWebDriver driver;
	public String filename;
	public int sheetIndex;
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preCondition(String browser,String url,String username,String password) {
		if(browser.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);

		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	@DataProvider(indices= {0,3})
	public String[][] sendData() throws IOException {		
		String[][] data = ReadExcel.readData(filename,sheetIndex);
		return data;
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	/*
	 * @BeforeClass public void beforeClass() { System.out.println("BeforeClass"); }
	 * 
	 * @AfterClass public void afterClass() { System.out.println("AfterClass"); }
	 * 
	 * @BeforeTest public void beforeTest() { System.out.println("BeforeTest"); }
	 */

	/*
	 * @AfterTest public void afterTest() { System.out.println("AfterTest"); }
	 * 
	 * @BeforeSuite public void beforeSuite() { System.out.println("BeforeSuite"); }
	 * 
	 * @AfterSuite public void afterSuite() { System.out.println("AfterSuite"); }
	 */

	
	
	
	
	
}
