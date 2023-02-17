package com.lao.rest_assured_training;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class PostRequestExamples {
@Test	
public void PostRequest() {
	RestAssured.baseURI="https://reqres.in/api/users";
	
	JSONObject json=new JSONObject();
	json.put("name", "siva hariharan");
	json.put("job", "Angular Developer");
	
	System.out.println(json.toString());
	
 ValidatableResponse repsonse=	RestAssured
		 .given()
	.header("","")
	.body(json.toJSONString())
	.post("")
	.then()
	.statusCode(201);



}

}
