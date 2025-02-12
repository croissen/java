package lambdaTask2;

import lambdaTest.LambdaInter;

//1) 1~10까지 출력해주는 람다구현 PrintNum 인터페이스, printUpTo10() 메서드
//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
//3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove, removeStr()
//5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"




public class LambdaResult2 {	
	public static void main(String[] args) {
		
//		1번
		PrintNum ten =() -> {
			for(int i = 0; i < 10; i++) {
                System.out.print(i + 1 + " ");
            }
		};
		ten.printUpTo10();
		
		System.out.println();
		
//		2번
		PrintString countNum =(str, c) -> {
			   int count = 0;
			   for(int i = 0; i < str.length(); i++) {
				   if(str.charAt(i) == c) {
					   count++;
				   }
			   }
			   
			   System.out.println(str +"에서 " + c +"의 갯수는 " + count + "개");
		}; 
		countNum.strCount("wqewqekwe", 'w');
		
//		3번
		Reverse reverse =(str) -> {
			String result = "";
			for(int i=0; i<str.length(); i++) {
				result += str.charAt(str.length() - i - 1);
			}
			return result;
		};
		String result3 = reverse.reverseString("wdwdwdd");
		System.out.println(result3);
		
//		4번
		Remove del =(str, c) -> {
			   String result = "";
			   for (int i = 0; i < str.length(); i++) {
	                if (str.charAt(i) != c) {
	                    result += str.charAt(i);
	                }
	            }
	            System.out.println(str + "에서 '" + c + "'를 제거하면: " + result);
	        };
		del.removeStr("wqewqekwe", 'w');
		
//		5번
		Dedupe dedupe = (str) -> {
			String result = "";
			for(int i=0; i < str.length(); i++) {
				if(!result.contains(String.valueOf(str.charAt(i)))) {
					result += String.valueOf(str.charAt(i));
				}
			}
			return result;
		};
		String result5 = dedupe.getDedupe("saddasds");
		System.out.println(result5);
		
	
		
	}
}
