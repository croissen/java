package classTest;

public class StaticTest {
	
	int data = 10;
	static int data_s = 10;
	
	void increse() {
		System.out.println(++data);
	}
	
	static void increse_s() {
		System.out.println(++data_s);
	}
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
//		st.increse_s();
//		st.increse_s();
//		st.increse_s();
//		st.increse_s();
//		st.increse_s();
//		st = new StaticTest();
//		st.increse_s();
//		st.increse_s();
//		st.increse_s();
//		st.increse_s();
//		st.increse_s();
				
		st.increse();
		st.increse();
		st.increse();
		st.increse();
		st.increse();
		st = new StaticTest();
		st.increse();
		st.increse();
		st.increse();
		st.increse();
		st.increse();
				
	}
}
