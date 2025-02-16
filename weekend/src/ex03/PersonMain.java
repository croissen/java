package ex03;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person("홍길동", 20, "백수", "잠자기");
//		person.printName();
//		person.work();
//		person.hobby();

//		실행
		Person student = new Student("고길동", 30, "학생", "둘리혼내기", 13579);
		student.work();
		student.hobby();
		Student student2 = (Student)student;
		student2.printNumber();
		System.out.println();
		Person programmer = new Programmer("개발자 곽", 27, "개발자", "코딩문제풀기", 2468, true);
		programmer.work();
		programmer.hobby();
		Programmer kwak = (Programmer)programmer;
		kwak.isNotebook();
		
		
		
		
		
		
	}
}
