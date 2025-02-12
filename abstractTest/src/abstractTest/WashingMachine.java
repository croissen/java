package abstractTest;

//			넘치는건 괜찮지만 부족한건 안됨
public class WashingMachine extends Electronics{
	@Override
	public void on() {
		System.out.println("버튼 눌러서 전원 켜기");
	}
	@Override
	public void off() {
		System.out.println("버튼 눌러서 전원 끄기");
	}
}
