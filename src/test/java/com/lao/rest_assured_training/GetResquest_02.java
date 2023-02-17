package com.lao.rest_assured_training;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetResquest_02 {
	
@Test	
public void getReqestExample() {
	
	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	
    int statusCode =response.statusCode();
    
    System.out.println(statusCode);
    
    ResponseBody responebody=response.body();
    
    System.out.println(responebody);
    System.out.println(responebody.asString());
    System.out.println(responebody.asPrettyString());
	
}

}
