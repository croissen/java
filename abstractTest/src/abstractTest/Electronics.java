package abstractTest;

public abstract class Electronics {
	//abstract = 추상클래스, 있을것 같은 필드값
//	추상 메서드
	public abstract void on(); //있긴있어 기다려 
	public abstract void off();
	
//	상수 : final, 값이 안바뀜
	public final void safe() {
		System.out.println("안전장치 가동");
	
	}
}
