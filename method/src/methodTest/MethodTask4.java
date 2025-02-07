package methodTest;

import java.util.Scanner;

public class MethodTask4 {
//  1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
//    public static int countChar(String str, char ch) {
//        return (int) str.chars().filter(c -> c == ch).count();
//    }
    
	
//  2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
    public static int getValueAtIndex(int[] arr, int index) {
        return (index >= 0 && index < arr.length) ? arr[index] : -1; 
    };
    
//  3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
    public static String convertToNumber(String input) {
        String numbers = "공일이삼사오육칠팔구";
        String result = "";

        for (char c : input.toCharArray()) {
            result += numbers.indexOf(c); 
        }
        return result;
    }
//    void getStr(String str) {
//    }
    
    
	
//  4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드

	
//  5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
    
    
//  6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1번
//        System.out.print("문자열 입력: ");
//        String str = sc.nextLine();
//        System.out.print("찾을 문자 입력: ");
//        char ch = sc.next().charAt(0);
//        
//        System.out.println(ch + "의 개수: " + countChar(str, ch));
//        sc.close();
		
//		2번
//        int[] numbers = new int[5];
//
//        System.out.println("정수 5개를 입력하세요:");
//        for (int i = 0; i < 5; i++) {
//            numbers[i] = sc.nextInt();
//        }
//
//        System.out.print("찾을 인덱스 입력: ");
//        int index = sc.nextInt();
//
//        int result = getValueAtIndex(numbers, index);
//        System.out.println((result != -1) ? 
//        		"해당 인덱스 값: " + result : "유효하지 않은 인덱스입니다.");
//        
//        sc.close();
		
//		3번
		  System.out.println(convertToNumber("공일공사팔사이사구일공")); // 출력: 1024
	}
}
