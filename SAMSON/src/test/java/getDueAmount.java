import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;

import com.generalutilities.*;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class getDueAmount {

	public static void dueAmount() throws IOException {
		Properties due_urls = ReadDBdetails.readdbdetails();
		RestAssured.baseURI = due_urls.getProperty("dueamount_Base_URL");
		RestAssured.useRelaxedHTTPSValidation();
		RequestSpecification request = RestAssured.given();

		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer 47835463894");
		request.header("activityid", "874634786387346");

		JSONObject req = new JSONObject();
		req.put("financialAccountNumber", "958601565");
		req.put("numberOfMonths", "5");
		request.body(req.toString());

		Response response = request.post(due_urls.getProperty("dueamount_Path_URL"));

		String res = response.body().asString();
		JsonPath json = response.jsonPath();

	}

}
