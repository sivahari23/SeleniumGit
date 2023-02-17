package com.lao.rest_assured_training;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class anotherGetRequestExample {
	
	@Test
	public void PostRequestExmaple() {
		RestAssured.baseURI="https://reqres.in/api";
		
	ValidatableResponse response=	RestAssured
		.given()
		//.param("", "")
		//.header("","")
		.when()
		.get("/users?page=2")
		.then()
		.statusCode(200);
	
	System.out.println(response.hashCode());
		
	}

}
