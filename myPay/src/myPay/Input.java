package myPay;

public class Input {
	int 국취제 = 500_000;
	int 용돈 = 800_000;
	int 훈련수당 = 190_000;
	int 추가수익 = 20_000; //피파 20000원
	int 회차 = 3; // 3회차까지 수령 / 4,5,6회차 남음
	int 급여일;
	
	public Input() {;}

	void 국취제정보() {
		System.out.println("국취제에서 현재 " + 회차 +"회차까지 받았고, 금액은 " + 국취제 + "원 입니다."  );
	}
	void 용돈정보() {
		System.out.println("용돈은 " + 용돈 + "원 입니다."  );
	}
	void 훈련수당() {
		System.out.println("훈련수당은 " + 훈련수당 + "원 입니다."  );
	}
	
	void 총수입() {
		System.out.println("이번달 총 수입은 현재 " + (int)(국취제 + 용돈 + 훈련수당 + 추가수익) + "원입니다." );
	}
	
	
}
