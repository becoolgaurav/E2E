package testcases;



import org.testng.Reporter;

import org.testng.annotations.Test;


import com.leaarnautomation.pages.LoginPage;
import com.leaarnautomation.pages.RegisterationPage;
import com.learnautomation.base.BaseClass;
import com.learnautomation.dataprovider.DataProviders;


public class RegistrationTest extends BaseClass {
	
	
	
	@Test(dataProvider = "TestData1",dataProviderClass = DataProviders.class)
	public void registrationCheck(String uname,String email,String pass,String state, String Hobby)
	{		
		Reporter.log("Launching the Registeration Login", true);
				 LoginPage page=new LoginPage(driver);
				 RegisterationPage register=new RegisterationPage(driver);
				 register= page.clickSignUp();
				 register.register(uname,email,pass,state,Hobby);
	}
	
	

}
