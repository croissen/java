package myPay;

public class MyPay {
	Input input = new Input();
	int 통신비 = 48_000;
	int 교통비 = 65_000;
	int 보험비 = 66_000;
	int 월세 = 450_000;
	int 식비 = 10000 * 28;
	int	기타 = (input.국취제 + input.용돈 + input.훈련수당 + input.추가수익) / 10;
	

	void 통신비정보() {
		System.out.println("통신비는" + 통신비 + "원 입니다.");
	}
	void 교통비정보() {
		System.out.println("교통비는 " + 교통비 + "원 입니다.");
	}
	void 보험비정보() {
		System.out.println("보험비는 " + 보험비 + "원 입니다.");
	}
	void 월세정보() {
		System.out.println("월세는 " + 월세 + "원 입니다.");
	}
	void 식비정보() {
		System.out.println("식비는 " + 식비 + "원 입니다.");
	}
	void 기타정보() {
		System.out.println("기타는 " + 기타 + "원 입니다.");
	}
	

	
	
	
	
	
	
	
	
	
}
