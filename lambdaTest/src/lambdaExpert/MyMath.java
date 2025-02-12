package lambdaExpert;

import java.util.Scanner;

//	연산자 1개를 전달 받아서 알맞게 연산하도록 람다식을 구현
public class MyMath {
	public static Calc calculator(String oper) {
        return switch (oper) {
            case "+" -> (a, b) -> a + b;
            case "-" -> (a, b) -> a - b;
            case "*" -> (a, b) -> a * b;
            case "/" -> (a, b) -> a / b; 
            default -> (a, b) -> 0;
        };
    }
	public static void main(String[] args) {
//		사용자가 수식을 입력
//		전체 수식에서 연산자만 분리하는 메서드를 구현
//		알맞게 연산 처리
//		결과 값을 출력
		
		Scanner sc = new Scanner(System.in);
        String inputNumber = sc.nextLine();

        // 숫자만 배열로 분리
        String[] numbers = inputNumber.split("[+\\-*/]");

        // 연산자만 배열로 분리 (람다식 활용)
        OperCheck operCheck = express -> express.replaceAll("[0-9]", "").split("");
        String[] operators = operCheck.getOpers(inputNumber);

        // 연산 수행
        int result = Integer.parseInt(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            result = calculator(operators[i - 1]).calc(result, Integer.parseInt(numbers[i]));
        }

        System.out.println("결과: " + result);
	      
	      
	      
	}
}

