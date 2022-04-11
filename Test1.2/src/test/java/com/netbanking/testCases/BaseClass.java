package com.netbanking.testCases;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.netbanking.Utilities.*;

public class BaseClass {
		
		ReadConfig rc = new ReadConfig();
		public static WebDriver driver;
		public static Logger logger;
		String baseURL= rc.getBaseURL();
		String username=rc.getUserName();
		String password=rc.getUserPassword();
		
		@BeforeClass
		public void setup()
		{
			driver= rc.getDriver();
			logger = Logger.getLogger("EBanking");
			PropertyConfigurator.configure("Log4j.properties");
		}
		
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}
}


