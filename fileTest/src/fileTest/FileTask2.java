package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileTask2 {
	public static void main(String[] args) throws IOException{
			ArrayList<User> users = new ArrayList<User>();
			User user1 = new User(1L, "홍길동", 20, "의적");
			User user2 = new User(1L, "김영희", 20, "교사");
			User user3 = new User(1L, "김철수", 20, "코딩");
			User user4 = new User(1L, "장발장", 20, "도둑");
			User user5 = new User(1L, "이광수", 20, "개그맨");
			
			users.add(user1);
			users.add(user2);
			users.add(user3);
			users.add(user4);
			users.add(user5);
			
//			System.out.println(users);
			
//			oo님의 직업은 ooo 입니다. 를 job.txt에 작성하고 콘솔 출력
//			Strem APi사용
	      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("jobs.txt"));
	      
//	      Arrays.asList(users).stream().forEach((user) -> {
	      users.forEach((user) -> {
	         try {
	        	bufferedWriter.write(user.getName() + "님의 직업은 " + user.getJob() + "입니다.\n");
	        	
//	            bufferedWriter.write(user1.getName() + "님의 직업은 " + user1.getJob() + "입니다.\n");
//	            bufferedWriter.write(user2.getName() + "님의 직업은 " + user2.getJob() + "입니다.\n");
//	            bufferedWriter.write(user3.getName() + "님의 직업은 " + user3.getJob() + "입니다.\n");
//	            bufferedWriter.write(user4.getName() + "님의 직업은 " + user4.getJob() + "입니다.\n");
//	            bufferedWriter.write(user5.getName() + "님의 직업은 " + user5.getJob() + "입니다.");
	         } catch (IOException e) {
	        	 
	            e.printStackTrace();
	         }
	      });
	      
	      bufferedWriter.close();
	      
	      String line = null;
	      BufferedReader bufferedReader = new BufferedReader(new FileReader("jobs.txt"));
	      
		  while((line = bufferedReader.readLine()) != null) {
			  System.out.println(line);
		  }
		  bufferedReader.close();
			
			
			
			
			
			
			
		
	}
}
