package com.netbanking.testCases;

import com.netbanking.pageObjects.CreateNewCustomer;

public class TC_CreateNewCustomer_001 extends BaseClass {
	
	void createNewCustomer()
	{
		CreateNewCustomer cnc = new CreateNewCustomer(driver);
		cnc.enterName("");
		cnc.enterDob("");
		cnc.enterAddr("");
	}

	
}
