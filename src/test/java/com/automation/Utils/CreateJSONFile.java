package com.automation.Utils;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.JsonObject;

public class CreateJSONFile {

	public static void fileWrite(JsonObject jsonObject) {

		try {
			FileWriter file = new FileWriter("TransferRates.json");
			file.write(jsonObject.toString());
			file.flush();
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	public static void  createObj(JsonObject jsonObject, String rate, String country, String website) {
//		jsonObject.addProperty("Rate", rate);
//		jsonObject.addProperty("Send Country", "US");
//		jsonObject.addProperty("Receive Country", country);
//		jsonObject.addProperty("Website", website);
//		
//	}
}
