package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class LogoutFuntionality extends ProjectSpecificMethod{
	
	
		
	@Test
	public void runLogout() {
				
		/*
		 * LoginPage lp=new LoginPage(); lp.enterUsername(); lp.enterPassword();
		 * 
		 * 
		 * WelcomePage wp= new WelcomePage(); wp.clickCrmsfa();
		 */
		
		new LoginPage().enterUsername().enterPassword().clickLogin().clickLogout();
		
	}

}
