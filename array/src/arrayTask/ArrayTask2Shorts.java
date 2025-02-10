package arrayTask;

import java.util.Scanner;

public class ArrayTask2Shorts {
	
//	1번
    public static String swapCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        return result.toString();
    }
	
//	2번
    public static String numberToKorean(int num) {
        String[] koreanNumbers = {"공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
        String result = "";
        
        if (num == 0) return "공"; // 0일 경우 예외 처리

        while (num > 0) {
            result = koreanNumbers[num % 10] + result; // 문자열을 앞에 추가
            num /= 10;
        }
        
        return result;
    }

    
//    3번
    public static int countChar(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        return count;
    }
    
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너 
		
//      1) 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//      대문자는 모두 소문자로 변경한다.
//      입력 예) 안녕hI!!
//      출력 예) 안녕Hi!!
		  
//		 System.out.print("문자열 입력: ");
//	        String input = sc.nextLine();
//	        System.out.println("변환 결과: " + swapCase(input));
//	        sc.close();

	   
//
//		
//
//      2) 정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사
		
		// 정수 입력받기
        System.out.print("정수를 입력하세요: ");
        int number = sc.nextInt();
        
        // 정수를 한글로 변환
        String koreanNumber = numberToKorean(number);
        
        System.out.println("한글로 변환된 값: " + koreanNumber);
        
        sc.close();
	    




//      3) 문자열과 찾을 문자를 입력받고
//      문자열에서 문자의 개수를 찾기
//      예시) 입력: content cc!
//          찾을문자 : c
//          c의 개수 3개
//	        System.out.print("문자열 입력: ");
//	        String str = sc.nextLine();
//	        
//	        System.out.print("찾을 문자 입력: ");
//	        char target = sc.next().charAt(0);
//	        
//	        System.out.println("'" + target + "'의 개수: " + countChar(str, target));
//	        
//	        sc.close();
//	    
	    
	}
}


