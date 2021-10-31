package com.qa.code;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TC_PUT_004 {
	
	
	@Test
	public void TC_004() {
		
JSONObject req = new JSONObject();
		
		req.put("name", "Kim Smith");
		req.put("job", "QA");
		
		given()
		.header("content-type" , "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(req.toJSONString())
		.when().patch("https://reqres.in/api/users/2")
		.then()
		.statusCode(200).log().all();
		
		//put() / patch() --> update the records
	}

}
