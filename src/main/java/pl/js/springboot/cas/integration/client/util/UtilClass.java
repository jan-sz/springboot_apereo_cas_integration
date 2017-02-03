package pl.js.springboot.cas.integration.client.util;

import java.sql.Timestamp;

public class UtilClass {

	public static String getCurrentTimeString()
	{
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		return timestamp.toString();		
	}
}
