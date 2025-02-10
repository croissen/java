package classTest;

public class Company {
//  회사원은 총 4명(객체 생성)
//  1번 +10000원
//  2번 +1000원
//  3번 +2000원
//  4번 -20000원
//  각 회사의 총 수입을 출력하기
	static int totalInput;
	String name;
	int age;
	int input;
	
	public Company() {;}
	
	public Company(String name, int age) { 
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Company person1 = new Company("피카츄", 20);
		Company person2 = new Company("라이츄", 21);
		Company person3 = new Company("파이리", 22);
		Company person4 = new Company("꼬부기", 23);

		person1.input += 10_000;
		person1.input += 1_000;
		person1.input += 2_000;
		person1.input -= 20_000;
		
		Company.totalInput += person1.input;
		Company.totalInput += person2.input;
		Company.totalInput += person3.input;
		Company.totalInput += person4.input;
		
		System.out.println(Company.totalInput);
		
	}
	
	
}
