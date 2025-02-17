package myPay;

public class PayMain {
	public static void main(String[] args) {
//		수익
		Input input = new Input();
		input.회차 = 3;
		input.국취제정보();
		int 총수입 = input.국취제 + input.용돈 + input.훈련수당 + input.추가수익;
		input.총수입();
		
		
//		지출
		MyPay myPay = new MyPay();
		int 총지출 = myPay.교통비 + myPay.보험비 + myPay.통신비 + myPay.월세 + myPay.식비 + myPay.기타;
		System.out.println("이번달 총 고정 지출은 적어도 " + 총지출 + "원 입니다.");
		
//		마진
		int 마진 = 총수입 - 총지출;
		System.out.println("남은 돈은 " + 마진 + "원입니다.");
		
		
		
		
	}
}
