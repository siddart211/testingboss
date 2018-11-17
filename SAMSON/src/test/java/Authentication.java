import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class Authentication {
	
	@Test
	public static String authentication()
	{
		RestAssured.baseURI="https://qlab02.core.op.api.t-mobile.com/v1/oauth2/accesstoken?grant_type=client_credentials";
		
		RequestSpecification request=RestAssured.given();
		
		//RequestHeaders
		request.header("Content-Type","application/json");
		request.header("Accept","application/json");
		request.header("Authorization","Basic ejNqeDN6NGdaOWNCbW4wMUFmVllKOVJDSkFOTzkxbFc6cWNWcFFyYnB6OGtMS29YNA==");
		
		Response response=request.get();
		
		String responsevalues=response.getBody().asString();
		System.out.println(responsevalues);
		
		return responsevalues;
		
	}

}
