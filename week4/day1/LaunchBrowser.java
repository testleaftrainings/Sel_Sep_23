package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser extends LearnStatic{
	static final String pi="3.14";
	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		String compName = LearnStatic.compName;
		empDetails();
		/*
		 * LearnStatic ls=new LearnStatic(); ls.empDetails();
		 */

	}

}
