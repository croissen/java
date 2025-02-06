package inputTask;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "3개의 정수를 입력하세요", result = "";
		int num1 =0, num2=0, num3=0, number=0;
		// "%d * %d * %d= %d" 이걸로 하고 printf 사용가능
		
		System.out.println(message);
		System.out.print("첫번째 정수 : ");
		num1 = Integer.parseInt(sc.next());
		System.out.print("두번째 정수 : ");
		num2 = Integer.parseInt(sc.next());
		System.out.print("세번째 정수 : ");
		num3 = Integer.parseInt(sc.next());
		number = num1 * num2 * num3;
		result= "답 = " + num1 + " x " + num2 + " x " + num3 + " = " + number;
		System.out.println(result);
		
		
		
		
	}
}
