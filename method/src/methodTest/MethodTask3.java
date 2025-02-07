package methodTest;

import java.util.Scanner;

public class MethodTask3 {
	//1) 세 정수를 뺄셈해서 결과값을 알려주는 메소드
	int subtract(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
	
	//2) 두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드(배열사용)
	int[] shareNum(int num1, int num2) {
//		share = num1 / num2;
//		System.out.println(num1 + " / " + num2);
//		System.out.println("몫 = " + share);
//		return num1 / num2;
		return new int[] {num1 / num2, num1 % num2};
	}
	
	//3) 1~n까지의 합을 구해주는 메소드
	int plusN(int num, int result) {
		 result = 0;
		 for(int i = 0 ; i <= num; i++) {
			result += i;
			System.out.println(result);
		}
		 return result;
	}
	
	//4) 어떤 값이 홀수인지 짝수인지 알려주는 메소드
	void oddEven(int num) {
//		String
//		return num % 2 == 0 ? "짝수" : "홀수";
		
		if(num % 2 == 0) {
			System.out.println(num + "= 짝수입니다.");
		}else {
			System.out.println(num + "= 홀수입니다.");
		}
	}
	
	
	//5) 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//	void change(String alpha) {
//		String result = "",
//		for(int i = 0; i < alpha.length(); i++) {
//			char c = alpha
//		}
//	}
	
	
	public static void main(String[] args) {
		MethodTask3 mt3 = new MethodTask3();
		Scanner sc = new Scanner(System.in);
//		1번문제
//		int result = 0;
//		result = mt3.subtract(1, 3, 5);
//		System.out.println(result);
		
//		2번문제
//		int num1= 0, num2= 0, share = 0, empty= 0;
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		mt3.shareNum(num1, num2, share, empty);
		int result = 0;
		int[] arr = null;
		arr = mt3.shareNum(20, 5);
		System.out.println("두 수의 몫" + arr[0]);
		System.out.println("두 수의 나머지" + arr[1]);
		
//		3번문제
//		int result1 = 0, num = 0;
//		num = sc.nextInt();
//		mt3.plusN(num, result1);
		
//		4번문제
//		int num = sc.nextInt();
//		mt3.oddEven(num);
		
		//5) 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	}
	
}

