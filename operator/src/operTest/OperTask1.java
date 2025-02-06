package operTest;

import java.util.Scanner;

public class OperTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String message = "값을 입력해주세요", result = null;
		double num1 = 0.0;
		int num2 = 0;
				
		System.out.println(message);
		
		num1 = Double.parseDouble(sc.next()) ;
		num2 = (int)num1;
//		result = num1 == num2 ? "입력한 값은 정수입니다" : "입력한 값은 실수입니다";
//		result = num1 - num2 == 0 ? "입력한 값은 정수입니다" : "입력한 값은 실수입니다";
		result = num1 % 1 == 0 ? "입력한 값은 정수입니다" : "입력한 값은 실수입니다";
		
		System.out.println(result);
	}
}
