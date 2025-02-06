package inputTest;

import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String message = "이름을 입력하세요", lastname= null, firstname= null, name = null;

		System.out.println(message);
//		lastname = sc.next();
//		firstname = sc.next();
//		
//		name = lastname + firstname;	
		name = sc.nextLine();	
		System.out.println(name + "님 환영합니다");
	}
}
