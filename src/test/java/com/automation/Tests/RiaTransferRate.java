package com.automation.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.automation.Pages.Ria;
import com.automation.Utils.BaseTest;
import com.automation.Utils.CreateJSONFile;
import com.google.gson.JsonObject;

public class RiaTransferRate extends BaseTest {
	
	Ria riaTransfer;

	@BeforeClass
	public void setup() {
		riaTransfer = new Ria(getDriver());
	}

	@Test
	public void getRemitlyRate() {

		JsonObject jsonObject = new  JsonObject();
		
		riaTransfer.inputSendTo();
		riaTransfer.inputYouSend();
		float receivedAmt = riaTransfer.theyGet();
		String rate = riaTransfer.getRate(receivedAmt);
		jsonObject.addProperty("Rate", rate);
		jsonObject.addProperty("Send Country", "US");
		jsonObject.addProperty("Receive Country", "India");
		jsonObject.addProperty("Website", "Ria");
		CreateJSONFile.fileWrite(jsonObject);
		
	}

}
