package com.qa.code;

import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class TC_GET_001 {

	@Test
	public void TC_001() {
		
		// Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		
		Response res = get("https://reqres.in/api/users?page=2");
		
		String asString = res.asString();
		System.out.println(asString);
		
		
		ResponseBody body = res.getBody();
		System.out.println(body.asString());
		
		int statusCode = res.getStatusCode();
		System.out.println(statusCode);
		
		String header = res.getHeader("content-type");
		System.out.println(header);
		
		String statusLine = res.getStatusLine();
		System.out.println(statusLine);
		
		long time = res.getTime();
		System.out.println(time);
		
		Assert.assertEquals(200, statusCode);
		
		
	}
	
}
