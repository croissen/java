package ex03;

public class Person {

	String name;
	int age;
	String job;
	String hobby;
	
	public Person() {;}

	public Person(String name, int age, String job, String hobby) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.hobby = hobby;
	}
	
	public void printName() {
		System.out.println(name);
	}

	public void work() {
		System.out.println(job + "는 하는 일이 없습니다.");
	}
	
	public void hobby() {
		System.out.println("취미는 " + hobby + " 입니다.");
	}
	
	
}
