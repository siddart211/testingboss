import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class PostRequest {
  @Test
  public void postrequest() {
	  RestAssured.baseURI="http://restapi.demoqa.com/customer";
	  RequestSpecification requestjson=RestAssured.given();
	  
	  JSONObject request= new JSONObject();
	  request.put("FirstName","sid");
	  request.put("LastName","G");
	  request.put("UserName","Gsiddar");
	  request.put("Password","test1123");
	  request.put("Email","siddartha211@gmail.com");
	  requestjson.header("Content-Type", "application/json");
	  requestjson.body(request.toString());
	  Response response = requestjson.post("/register");
	  int status=response.getStatusCode();
	 
	  
	  JsonPath path=response.jsonPath();
	  System.out.println("Temparature is " +path);
	  
	  
	  	
	 
	  
  }
}
