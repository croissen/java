package classTest;

public class Student {
 
//	학생의 학번, 이름 , 국어점수 영어점수, 수학점수 입력받고 총점과 평균 출력
	int schoolNum;
	String name; 	
	int kor;			
	int eng;			
	int math;	
	int total;
	double average;
	
	public Student() {;}
	public Student(int schoolNum, String name, int kor, int eng, int math) {
		this.schoolNum = schoolNum;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = Double.parseDouble(String.format("%.3f", total / 3.0));
	}
	
	public static void main(String[] args) {
		Student st = new Student(1123, "곽승민" , 100 , 100 , 10);
		System.out.println("총점 : " + st.total);
		System.out.println("평균 : " + st.average);
		System.out.println(st.schoolNum);
	}
	
	
	
}
