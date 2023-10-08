package week4.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Identify the table
		WebElement table = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody"));
		
		//Identify the rows count
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		
		//Identify the columns		
		List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));
    	//From tablebody-->row-->get the col count
		
		System.out.println(cols.size());
		
		//to get one single value from the table 
		String text = cols.get(2).getText();
		System.out.println(text); //from second row third col data
		
		//From second row all col values -Method
		System.out.println("From second row all col values");
		for (WebElement colValues : cols) {
			System.out.println(colValues.getText());
		}
		
		//From second row all col values -Method2
		
		for(int i=1;i<cols.size();i++) {
			WebElement rowData=driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td["+i+"]"));
			System.out.println(rowData.getText());
		}
		System.out.println("**************************************");
		System.out.println("From all row of 1st col values");
		//to get data of one columns from all rows
		for(int i=1;i<rows.size();i++) {
			WebElement allrowData=driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td[1]"));
			System.out.println(allrowData.getText());
		}		
		
		System.out.println("**************************************");
		System.out.println("Print all values from the table");
		
		for (WebElement allRow : rows) {
			System.out.println(allRow.getText());
		}
		
		

	}

}
