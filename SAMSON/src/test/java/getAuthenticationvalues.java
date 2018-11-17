import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import com.generalutilities.ReadDBdetails;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * 
 * @author gsiddart
 *
 */

public class getAuthenticationvalues {

	public static void main(String[] args) throws IOException, SQLException {

		/*Properties urls = ReadDBdetails.readdbdetails();

		RestAssured.baseURI = urls.getProperty("Base_URL");

		RestAssured.useRelaxedHTTPSValidation();
		RequestSpecification request = RestAssured.given();
		// RequestHeaders
		request.header("Content-Type", "application/json");
		request.header("Accept", "application/json");
		request.header("Authorization", "Basic ejNqeDN6NGdaOWNCbW4wMUFmVllKOVJDSkFOTzkxbFc6cWNWcFFyYnB6OGtMS29YNA==");
		Response response = request.get(urls.getProperty("Path_URL"));
		String responsevalues = response.getBody().asString();
		System.out.println(responsevalues);

		JsonPath jsonPathEvaluator = response.jsonPath();
		String token = jsonPathEvaluator.get("access_token");
		System.out.println(token);
		System.out.println("-----------------------------------------------------------------------------");
		*/
		//QAT02Connection.getData();
		//readingJson.readJson();
		getDueAmount.dueAmount();
		

	}
}
