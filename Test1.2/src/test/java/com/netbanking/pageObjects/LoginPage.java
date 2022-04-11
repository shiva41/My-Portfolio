package com.netbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	WebDriver rdriver;
	
	public LoginPage(WebDriver cDriver)
	{
			rdriver=cDriver;
			PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	@FindBy(name="btnReset")
	WebElement submit;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
		
		
/*	void geckoDriverStart()
	{
			WebDriverManager.firefoxdriver().setup();
	}
	void ieDriverStart()
	{
			WebDriverManager.iedriver().setup();
	}*/
	

}
