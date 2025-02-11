package access1;

public class Access1 {
	int data1;		
	public int data2;	 // 공공 데이터
	protected int data3; // 다른 서비스가 다른 필드값을 가져올 수 없게끔, 상속받은 자식은 접근할 수 있음
	private int data4;   // 이 안에서만 쓸수 있음, 이 값은 직접 절대 접근해서는 안됨-> 메서드를 통해서 접근
	// 1. 메서드 만들어야 함 , get, set
	
	public Access1() {;}
	
	public int getData4() {
		return data4;
	}
	
	public void setData4(int data4) {
		this.data4 = data4; // 이런식으로
	}
	
}
