import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class readingJson {

	public static void readJson() {
		JSONParser parser = new JSONParser();
		try {
			JSONArray ja = (JSONArray) parser
					.parse(new FileReader("C:\\Users\\gsiddart\\Desktop\\java\\SAMSON\\src\\test\\data.json"));
			for (Object o : ja) {
				JSONObject obj = (JSONObject) o;
				String name = (String) obj.get("name");

				System.out.println(name);

				JSONArray car = (JSONArray) obj.get("cars");

				for (Object ob : car) {
					System.out.println(ob);
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
