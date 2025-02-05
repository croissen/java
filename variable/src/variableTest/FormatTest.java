package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "곽승민";
		int age = 27;
		double height = 185.25;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("나이 : %.1fcm", height);
	
	}
}
