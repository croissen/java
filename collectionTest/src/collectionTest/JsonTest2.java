package collectionTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;



public class JsonTest2 {
	public static void main(String[] args) {
		
		JSONObject userJSON = new JSONObject();
		JSONArray usersJSON = new JSONArray();
		
		ArrayList<User> users = new ArrayList<User>();
		
		User user1 = new User(1, "고길동", 50, "회사원");
		User user2 = new User(2, "둘리", 5000, "공룡");
		User user3 = new User(3, "도우너", 500, "도넛");
		User user4 = new User(4, "짱구", 5, "유치원생");
		User user5 = new User(5, "훈이", 5, "유치원생");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		System.out.println(users);
//		for(User user : users) {
//			JSONObject JSONUser = new JSONObject();
//			userJSON.put(JSONUser);
//		}
//			
//		users.stream().map(user -> new JSONObject(user)).forEach(user -> {
//			usersJSON.put(user);
//		});
		users.stream().map(user -> new JSONObject(user)).forEach(user -> {
			usersJSON.put(user);
		});
		
		System.out.println(usersJSON.toString());	
		
	
	}
	
}

