import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;




public class SampleTest {
  @Test
  public void Sample() {
	  
	  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	  RequestSpecification request = RestAssured.given();
	  Response response = request.get("/Hyderabad");
	  String responseBody = response.getBody().asString();
	  System.out.println("Response Body is =>  " + responseBody);
	  /*int status=response.getStatusCode();
	  System.out.println(status);
	  Assert.assertEquals(status, 200);
	  System.out.println("Response status type is "+response.contentType());
	  System.out.println("Response status type is "+response.getHeader(responseBody));
	  System.out.println("Response status type is "+response.getTime());
	  System.out.println("Response status type is "+responseBody.toUpperCase());*/
	  Headers allheaders=response.headers();
	  for(Header header:allheaders)
	  {
		  System.out.println(header.getName()+" : "+header.getValue());
		  
	  }
	  JsonPath jsonpath=response.jsonPath();
	  System.out.println("Temparature is " +jsonpath.get("Temperature"));

	  
  }
}
