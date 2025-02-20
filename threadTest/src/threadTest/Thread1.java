package threadTest;
					// 지금부터 멀티쓰레드로 사용할 수 있는 일꾼이 됨
public class Thread1 extends Thread{
	
	public String data;
	
	public Thread1() {;}
	
 	public Thread1(String data) {
		this.data = data;
	}

	@Override //이제부터 일을 시킴
 	public void run() { // 여기 있는 자원만 접근 할 수 있음
		for(int i = 0; i < 5; i++) {
			System.out.println(data);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
