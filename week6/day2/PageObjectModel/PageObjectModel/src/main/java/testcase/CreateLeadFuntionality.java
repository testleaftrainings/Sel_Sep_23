package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class CreateLeadFuntionality extends ProjectSpecificMethod{
	
	
		
	@Test
	public void runLogin() {
				
		/*
		 * LoginPage lp=new LoginPage(); lp.enterUsername(); lp.enterPassword();
		 * 
		 * 
		 * WelcomePage wp= new WelcomePage(); wp.clickCrmsfa();
		 */
		
		new LoginPage().enterUsername().enterPassword().clickLogin().clickCrmsfa()
		.clickLeads().clickcreateLead();
		
	}

}
