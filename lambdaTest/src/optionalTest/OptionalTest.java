package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
	ArrayList<User2> users = new ArrayList<User2>(Arrays.asList(
			new User2("짱구", "gg", "1234"),
			new User2("철수", "cs", "1212"),
			new User2("맹구", "mg", "1248"),
			new User2("유리", "yr", "5810")
			));
			
	public Optional<User2> findById(Long id) {
		User2 user = null;
		for(User2 userInDB : users) {
			if(userInDB.getId() == id) {
				user = userInDB;
			}
		}
		return Optional.ofNullable(user);
		
	}		
			
	public static void main(String[] args) {
		OptionalTest ot = new OptionalTest();
//		Long num1 = 0L;
		
		Optional<User2> user = ot.findById(2L);
		
//		if(user != null) {
//			System.out.println(user.toString());			
//		}else {
//			System.out.println("존재하지 않는 회원");
//		}
		
//		orElse: null 이 아니라면 user, null이라면 대체 user
//		user.orElse(new User2());
		
//		orElseThrow: null 이 아니라면 user, null이라면 () -> { 예외발생 };
//		user.orElseThrow(()->{
//			throw new RuntimeException("그런사람 없어요");
//		});
		
		user.ifPresent((findUser) -> {
//			null 값이 아닐 때만 실행하는 로직
//			user가 있을 때만 아래 로직을 실행해!
			System.out.println("ifPresent");
			System.out.println(findUser.toString());
		});
		
		user.ifPresentOrElse((findUser) -> {
//			null이 아니면 실행
		}, () ->{
//			null 일 때 실행하는 로직
			System.out.println("그런사람 없어요");
		});
		
		System.out.println(user.isPresent());
		
		
		
		 
		
		
		
		
		
		
	}
	
}
