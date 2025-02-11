package inheritanceTest;

//상속 및 분리 실습
//Person 클래스
//이름, 나이, 주소, 핸드폰 번호
//work 일을 한다.
//sleep 잠을 잔다.
//eat 세 끼를 먹는다
class Person {
	String name;
	int age;
	String address;
	String phoneNumber;
	
	public Person() {;}

	public Person(String name, int age, String address, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	void work() {
		System.out.println("일을 한다.");
	}
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	void eat() {
		System.out.println("세 끼를 먹는다.");
	}
	
}

//Student 클래스
//인스타아이디
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다
class Student extends Person{
	String instagramId;
	public Student() {;}
	public Student(String name, int age, String address, String phoneNumber) {
		super(name, age, address, phoneNumber);
		this.instagramId = instagramId;
	}
	
	@Override
	void work() {
		System.out.println("아르바이트를 한다.");
	}
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다.");
	}
	@Override
	void eat() {
		System.out.println("아침을 거른다.");
	}	
	
}

//Employee 클래스
//비상금
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다
class Empoloyee extends Person{
	String hideMoney;
	public Empoloyee() {;}
	public Empoloyee(String name, int age, String address, String phoneNumber) {
		super(name, age, address, phoneNumber);
		this.hideMoney = hideMoney;
	}
	
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다.");
	}
	@Override
	void sleep() {
		System.out.println("잠을 설친다.");
	}
	@Override
	void eat() {
		System.out.println("야식을 먹는다.");
	}		
}




public class InheritanceTask2 {
//	메인 메서드 생성 후 객체화
	public static void main(String[] args) {
		Person doraemong = new Person("도라에몽", 1020, "지하나라벙커", "011-312-1234");
		Student noVita = new Student("노진구", 12, "일본 어딘가", "010-212-1231");
		Empoloyee shinChan = new Empoloyee("신짱구", 5,  "떡잎마을", "010-232-1234");
		noVita.instagramId = "vita_500";
		shinChan.hideMoney = "2000원";
		
		System.out.print(noVita.name + "는 ");
		noVita.eat();
		
		System.out.print(shinChan.address + "에 사는 " + shinChan.name + "는 ");
		shinChan.sleep();
		System.out.println("이슬아 내 인스타 아이디는 " + noVita.instagramId + " 이야." );
		System.out.println(doraemong.name + "이 " + shinChan.name + "의 비상금 " + shinChan.hideMoney + "을 발견했다.");
	}

}

