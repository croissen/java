package arrayTask;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너 
		
//      1) 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//      대문자는 모두 소문자로 변경한다.
//      입력 예) 안녕hI!!
//      출력 예) 안녕Hi!!
		  
	      String userInput = null, stringData = null, space = " ";
	      char[] charArray = null;
	      int arrayLength = -1;
	      
	      //질문
	      System.out.println("문자열을 입력해주세요 : "); 
	      //인풋 받기
	      userInput = sc.nextLine();				  	      
	      //space = 문자열을 f11 했을 때 질문의 위치가 바뀌지 않도록 잡아줌 
	      stringData = userInput + space;		
	      
	      //몇번 반복할 지 모르기에 do while문을 써서 
	      //arrayLength만큼 써지면 써진 소문자, 대문자를 지우고
	      //대문자, 소문자로 다시 추가
	      do {
	         arrayLength++;
	      } while (stringData.charAt(arrayLength) != ' ');
	      charArray = new char[arrayLength];
	      for(int i = 0; i < arrayLength; i++) {
	         charArray[i] = stringData.charAt(i);
	         if (charArray[i] >= 65 && charArray[i] < 97) {
	            charArray[i] += 32;
	         }else if (charArray[i] >= 97 && charArray[i] < 129) {
	            charArray[i] -= 32;
	         }
	         System.out.print(charArray[i]);
	      }      
//
//		
//
//      2) 정수를 한글로 변경
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
//

//      3) 문자열과 찾을 문자를 입력받고
//      문자열에서 문자의 개수를 찾기
//      예시) 입력: content cc!
//          찾을문자 : c
//          c의 개수 3개
//	      String message1 = "입력 : ";
//	      String message2 = "찾을문자 : ";
//
//	       String userInput = null, stringData = null, space = "\n";
//	       char[] charArray = null;
//	       int arrayLength = -1, count = 0;
//	       String find = null;
//	       
//	       System.out.print(message1);
//	       userInput = sc.nextLine();
//	       
//	       stringData = userInput + space;
//	       do {
//	          arrayLength++;
//	       } while (stringData.charAt(arrayLength) != '\n');
////	       배열 생성
//	      charArray = new char[arrayLength];
//	       
//	      
////	       찾을문자
//	       System.out.print(message2);
//	       find = sc.next();
//	       for(int i=0; i<arrayLength;i++) {
//	          charArray[i] = userInput.charAt(i);
//	          if(charArray[i] == find.charAt(0)) {
//	             count++;
//	          }
//	       }
//	       System.out.println(find + "의 갯수 : " + count);
//	      

	      
	      //주말 과제 =  메서드를 사용해서 코드를 간결하게 만들기

		
	}
}


