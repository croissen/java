package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		대소비교
//		두정수 입력받고 더 큰값 출력
		
		Scanner sc = new Scanner(System.in);
		String message = "두 정수를 입력하세요", result = null;
		int num1 = 0, num2=0;
				
		System.out.println(message);
		
		num1 = sc.nextInt();		
		num2 = sc.nextInt();	
		
		result = num1 > num2 ? "더 큰 값 : " + num1 
				: num1 == num2 ? "두 수가 같습니다" : "더 큰 값 :" + num2;
		
		System.out.println(result);
	}
}
