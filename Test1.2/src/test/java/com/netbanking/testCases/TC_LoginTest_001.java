package com.netbanking.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netbanking.pageObjects.LoginPage;



public class TC_LoginTest_001 extends BaseClass {
	

	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		logger.info("URL is Open");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Username");
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickLogin();
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
				AssertJUnit.assertTrue(true);
				logger.info("Login Test Passed");
		}
		else 
			{AssertJUnit.assertTrue(false);
			logger.info("Login Test Failed");
			}
	}

}
