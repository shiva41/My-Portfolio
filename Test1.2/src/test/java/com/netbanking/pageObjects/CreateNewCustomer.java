package com.netbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomer {
	WebDriver CDriver;
	
	public CreateNewCustomer(WebDriver driver)
	{
		CDriver = driver;
		PageFactory.initElements(CDriver, this);
	}

	@FindBy(name="name")
	WebElement Name;	
	@FindBy(name="dob")
	WebElement dob;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	WebElement male;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement female;
	@FindBy(name="addr")
	WebElement addr;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="pinno")
	WebElement pinno;
	@FindBy(name="telephoneno")
	WebElement telephoneno;
	@FindBy(name="emailid")
	WebElement emailid;
	@FindBy(name="sub")
	WebElement submit;

	
	public void enterName(String sendName)
	{
		Name.sendKeys(sendName);
	}
	public void enterDob(String senddob)
	{
		dob.sendKeys(senddob);
	}	
	public void enterAddr(String sendaddr)
	{
		addr.sendKeys(sendaddr);
	}	
	void enterCity(String sendcity)
	{
		city.sendKeys(sendcity);
	}	
	void enterPinno(String sendpinno)
	{
		pinno.sendKeys(sendpinno);
	}	
	void enterEmailid(String sendemailid)
	{
		emailid.sendKeys(sendemailid);
	}
	void clickSubmit(String clickSubmit)
	{
		submit.sendKeys(clickSubmit);
	}
	void enterState(String sendState)
	{
		state.sendKeys(sendState);
	}
	
}
