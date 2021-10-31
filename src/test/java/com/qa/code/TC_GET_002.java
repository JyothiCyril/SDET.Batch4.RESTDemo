package com.qa.code;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TC_GET_002 {
	
	@Test
	public void TC_001() {
		
//		given().get("https://reqres.in/api/users?page=2").then()
//		.statusCode(200)
//		.body("data.id[0]", equalTo(7))
//		.log().all();
		
		given().get("https://reqres.in/api/users?page=2").then()
		.statusCode(200)
		.body("data.id[1]", equalTo(8))
		.body("data.first_name", hasItems("Michael","Lindsay"))
		.log().all();
		
	}

}
