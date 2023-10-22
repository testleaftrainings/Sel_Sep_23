package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test(dataProvider = "sendData")//,invocationCount=2,threadPoolSize=2)
	public void runCreate(String cName, String fname, String lname) {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Creat Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();

	}

	/*
	 * @DataProvider public String[][] sendData() throws IOException { String[][]
	 * data = ReadExcel.readData();
	 * 
	 * return data; }
	 */
	
	@BeforeClass
	public void setValues() {
		filename="Leads";
		sheetIndex=0;
	}
	
	//createLead tc-->@DataProvider -->ReadExcelcode

}
