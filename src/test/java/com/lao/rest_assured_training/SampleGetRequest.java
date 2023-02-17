package com.lao.rest_assured_training;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGetRequest {

	public static void main(String[] args) {
		
	Response response=	RestAssured.get("https://www.google.com/");
		int statuscode= response.statusCode();
		System.out.println(statuscode);
		
		String statusLine =response.statusLine();
		
		System.out.print(statusLine);

	}

}
