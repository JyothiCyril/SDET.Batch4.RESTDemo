package com.qa.code;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TC_POST_003 {
	
	@Test
	public void TC_003() {
		
		JSONObject req = new JSONObject();
		
		req.put("name", "Kim Smith");
		req.put("job", "QA");
		
		
		//System.out.println(req);		
		//System.out.println(req.toJSONString());
		
		
//		given()
//		.body(req.toJSONString())
//		.when()
//		.post("https://reqres.in/api/users")
//		.then()
//		.statusCode(201);
		
		
//		given()
//		.header("content-type" , "application/json")
//		.contentType(ContentType.JSON)
//		.accept(ContentType.JSON)
//		.body(req.toJSONString())
//		.when().post("https://reqres.in/api/users")
//		.then()
//		.statusCode(201).log().all();
		
		
		
	}

}
