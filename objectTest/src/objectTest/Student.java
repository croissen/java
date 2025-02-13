package objectTest;
//1. 기본 생성자			ctrl + space + enter
//2. 초기화 생성자		alt shift s o
//3. private 붙이기		alt + Shift + a
//4. getter setter	alt shift s r alt + a r	
//5. toString 재정의	alt shift s s
public class Student {
	private int id;
	private String name;
	private int age;
	
	public Student() {;}

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
	
	public static void main(String[] args) {
		Student student = new Student(1, "곽승민", 20);
		
		if(student.equals(new Student(1, "곽승민", 20))) {
			System.out.println("책 대여");
		}else {
			System.out.println("도난 신고");
		}
		
	}
	
	
}
