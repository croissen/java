package ex01;

public class Calculator {

	public Calculator() {;}
	
	public int calcNum(int num1, int num2) {
		return num1 + num2; 
		
	}
	
	public double calcNum(int num1, double num2) {
		return num1 + num2;
	}
	
	public int calcNum(double num1) {
		return (int)num1;
	}

	public String calcNum(String str1, String str2) {
			return str1 + str2;
	}
	
	
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
try {
	//		1-1
			System.out.println(calculator.calcNum(5, 7));
	//		1-2
			System.out.println(calculator.calcNum(2, 3.75));
	//		1-3
			System.out.println(calculator.calcNum(2.121));
	//		1-4
			System.out.println(calculator.calcNum("곽", "승민"));
} catch (Exception e) {
	e.printStackTrace();
}

		
	}
}
