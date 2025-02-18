package collectionTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "ksm");
		userMap.put("password", "1234");
		userMap.put("name", "고승먼");
		userMap.put("age", 27);
		
		JSONObject json = new JSONObject(userMap);
		System.out.println(json);
		
	}
}
