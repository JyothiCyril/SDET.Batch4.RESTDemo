package com.qa.code;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class TC_DELETE_005 {
	
	@Test
	public void TC_005() {
		
		
		
		when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
		
		
	}

}
