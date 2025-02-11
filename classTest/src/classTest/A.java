package classTest;
//이해완료
public class A {

		int data; //필드
		
//오버로딩/다형성
		//기본생성자
		public A() {;} 
		// 값을 초기화 시키는 생성자, 초기화 생성자 alt shift s o enter
		public A(int data) { 
			this.data = data;
		}
		
		
		void printData() {
			System.out.println(this);
			System.out.println(this.data);
		}
		
		public static void main(String[] args) {
			A a = new A(10);
			A b = new A(20);
//			System.out.println(a.data);
//			System.out.println(b.data);
			a.printData();
			b.printData();
			
			
		}

		
		
		
	
	
}