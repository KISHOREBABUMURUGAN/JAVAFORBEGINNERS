package com_restassureAPI_Automation_;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.payload;

import static io.restassured.RestAssured.*;
public class Restassure_1 {
public static void main(String[]args) {
	//Given -all input details
	//When  -submit the API
	//Then  - to see the response
	
	RestAssured.baseURI="https://rahulshettyacademy.com";
	String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
	.body(payload.Addplace()).when().post("/maps/api/place/add/json").then().assertThat().statusCode(200)
	.body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();

	//log().all()-->function after then(),given() also be done we are doinf like 
	//saving in string 
	//body in params provide directly or by creating another class
	System.out.println(response);
	
	JsonPath jp=new JsonPath(response);//parsing that output as individual
	String placeId=jp.getString("place_id");
	String Scope=jp.getString("scope");//parsing that output as individual
	String Reference=jp.getString("reference");//parsing that output as individual
			System.out.println(placeId);
			System.out.println(Scope);
			System.out.println(Reference);
			
			//update put response
			String newaddress="Nagercoil,kanyakumari-629002";
			
			given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
			.body("{\r\n"
					+ "\"place_id\":\""+placeId+"\",\r\n"
					+ "\"address\":\""+newaddress+"\",\r\n"
					+ "\"key\":\"qaclick123\"\r\n"
					+ "}\r\n"
					+ "").when().put("/maps/api/place/update/json").then().assertThat()
			.log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
			
            //Get the place
			
			String getmethod=given().log().all().queryParam("key", "qaclick123")
			.queryParam("place_id", placeId).when().put("/maps/api/place/get/json").then().assertThat()
			.log().all().statusCode(200).extract().response().asString();
			
			JsonPath js=new JsonPath(getmethod);
			String actualaddress=js.getString("address");
			System.out.println(actualaddress);
	String expectaddress=js.getString(newaddress);
		Assert.assertEquals(actualaddress, newaddress);
		System.out.println("its verified==>");
			
}
}
