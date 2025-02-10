package methodTest;

public class MethodTest01 {

//	두개의 정수를 뺀 결과를 알려주는 메서드
	int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
//		MethodTest01 mt = new MethodTest01();
//		int result = 0;
//		result = mt.subtract(0, 0);

		MethodTest01 mt = new MethodTest01();
		int num1 = 0, num2 = 0;
		int result = num1 + num2;
		result = mt.plus(num1, num2);
	
	}
}
