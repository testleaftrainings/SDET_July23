package testcase;

import org.testng.annotations.Test;

import base.BaseClass1;
import pages.LoginPage1;

public class TC_0033 extends BaseClass1 {

	
	@Test
	public void CreateLead() {
		
		LoginPage1 lp= new LoginPage1();
		System.out.println(getDriver());
		

		lp.enterUserName1("DemoCsr").enterPassword1("crmsfa")
		.clickOnLogin1().clickOnCrmsfa().clickOnLead().clickOnFindLead();
}
}