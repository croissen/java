package exceptionTest;

import java.util.Scanner;

//5개의 정수를 입력 받기
//무한 입력 상태로 구현한다
//q를 입력시 나간다
//입력한 각 정수는 배열에 담는다
//if문은 딱 한 번만 사용한다.
public class exceptionTask {
	public static void main(String[] args) {
		int[] arData = new int[5];
		int count = 0;
		Scanner sc = new Scanner(System.in );
		String expression = null;
		String message = "정수 5개를 순서대로 입력하세요", exm = "번째 정수";
		
		System.out.println(message);
		while(true) {
			count ++ ;
			System.out.println(count + exm);
			expression = sc.next();
			
			if(expression.equals("q")) {
				break;
			}

			
			try {
				arData[count - 1] = Integer.parseInt(expression);
				arData[count] = 10;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개 정수를 모두 입력했습니다.");
				break;
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력하세요.");
				count--;
			} catch (Exception e) {
				System.out.println("알 수 없는 오류 발생");
				e.printStackTrace();
			} 
			
			for(int num : arData) {
			System.out.println(num);	
			}
			
			
				
				
			}
		}
	}
