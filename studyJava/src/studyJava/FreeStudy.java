package studyJava;

import java.util.Scanner;

public class FreeStudy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String question = "세 정수를 입력하세요.";
//		System.out.println(question);
//
//		System.out.println();
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		sc.close();
//		int[] num = null;
		
//      입력 예) 1024
//      출력 예) 일공이사
		
//	      String userInput = null, stringData = null, space = " ";
//	       int[] charArray = null;
//	       int arrayLength = -1;
//	      String[] hangleArray = {"공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
//	      String message = "정수를 입력하세요.";
//	       
//	       System.out.println(message);
//	       userInput = sc.nextLine();
//	       stringData = userInput + space;
//	       do {
//	          arrayLength++;
//	          } while (stringData.charAt(arrayLength) != ' ');
//	       
//	       charArray = new int[arrayLength];
//	       
//	      for(int i = 0; i < arrayLength; i++) { 
//	         charArray[i] = (int)stringData.charAt(i);
//	         System.out.print(hangleArray[charArray[i] - 48]);
//	      }

		String[] str = {"공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		String input= sc.nextLine();
		String result = "";
		result = (input == "공" ? "0" : "");
			System.out.println(result);
		}
		
	}
}
