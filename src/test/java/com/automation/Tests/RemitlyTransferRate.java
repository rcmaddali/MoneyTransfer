package com.automation.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.automation.Pages.Remitly;
import com.automation.Utils.BaseTest;
import com.automation.Utils.CreateJSONFile;
import com.google.gson.JsonObject;

public class RemitlyTransferRate extends BaseTest{
	
	Remitly remitlyTransfer;

	@BeforeClass
	public void setup() {
		remitlyTransfer = new Remitly(getDriver());
	}

	@Test
	public void getRemitlyRate() {

		JsonObject jsonObject = new  JsonObject();
		remitlyTransfer.clickOnDropDwn();
		remitlyTransfer.chooseCountry();
		remitlyTransfer.clickonGetStarted();
		String rate = remitlyTransfer.getRate();
		jsonObject.addProperty("Rate", rate);
		jsonObject.addProperty("Send Country", "US");
		jsonObject.addProperty("Receive Country", "India");
		jsonObject.addProperty("Website", "Ria");
		CreateJSONFile.fileWrite(jsonObject);
		
	}


}
