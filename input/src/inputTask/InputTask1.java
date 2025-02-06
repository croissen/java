package inputTask;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "정수 입력하세요" ;
		int num1 =0, num2=0, number=0;
		
		System.out.println(message);
		System.out.print("첫번째 정수 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		num2 = sc.nextInt();
		number = num1 + num2;
		System.out.println("답 = " + number);
	}
}
