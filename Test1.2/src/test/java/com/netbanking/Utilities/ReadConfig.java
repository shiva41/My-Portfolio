package com.netbanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.netbanking.testCases.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.jline.utils.Log;

public class ReadConfig  {
	WebDriver driver1;
	Properties prop;
	public ReadConfig()
	{	
		
		File src = new File("C:\\Users\\Nero\\git\\repository\\Test1.2\\Configuration\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}	catch (Exception e)
		{
				System.out.println("Exception : "+e.getMessage());
		}
	}
	public String getBaseURL()
	{
		String url = prop.getProperty("baseURL");
		return url;
	}
	public String getUserName()
	{
		String usr = prop.getProperty("username");
		return usr;
	}
	public String getUserPassword()
	{
		String pwd = prop.getProperty("password");
		return pwd;
	}
	public WebDriver getDriver()
	{		
			String browser = prop.getProperty("browser");
			
			if (browser.equals("chrome"))
			{	
				 WebDriverManager.chromedriver().setup();
				 driver1 = new ChromeDriver();
				 return driver1;
			}	
			else if (browser.equals("internetexplorer"))
			{	
				WebDriverManager.iedriver().setup();
				driver1 = new InternetExplorerDriver();
				return driver1;
			}
			else if (browser.equals("edge"))
			{	WebDriverManager.edgedriver().setup();
				driver1 = new EdgeDriver();
				return driver1;
			}
			else 
			{	
				System.out.println("Not a valid Browser Name, running by default browser");
				WebDriverManager.chromedriver().setup();
				 driver1 = new ChromeDriver();
				 return driver1;
			}
			
	}
	
}
