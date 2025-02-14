package objectTest;

import java.util.Objects;

//1. private 붙이기			alt + Shift + a
//2. 기본 생성자				ctrl + space + enter
//3. 초기화 생성자				alt shift s o
//4. getter setter			alt shift s r alt + a r	
//5. toString 재정의			alt shift s s
//6. hashCode, equals 재정의	alt + shift + s + h
public class Student {
	private int id;
	private String name;
	private int age;
		
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}


	public static void main(String[] args) {
//		Student student = new Student(1, "곽승민", 20);
						
//		if(student.equals(new Student(1, "곽승민", 20))) {
//			System.out.println("책 대여");
//		}else {
//			System.out.println("도난 신고");
//		}
		
	
	}
	
}
