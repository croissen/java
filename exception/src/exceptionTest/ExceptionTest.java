package exceptionTest;

public class ExceptionTest {
public static void main(String[] args) {
	int[] arData = new int[5];
	int num = 0;

//	alt + shift + z = try catch
	try {
		
//		System.out.println(arData[10]);
		arData[0] = 20; 
		System.out.println(arData[0] / num);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("배열 확인좀");
	} catch (ArithmeticException e) {
		System.out.println("0으로 나눌수가 없다");
		System.out.println(e.getClass());
		System.out.println(e.getMessage());
		e.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
 }
}
