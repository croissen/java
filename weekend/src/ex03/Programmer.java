package ex03;

public class Programmer extends Person{
	boolean notebook;
	
	public Programmer() {;}

	public Programmer(String name, int age, String job, String hobby, int number, boolean notebook) {
		super(name, age, job, hobby);
		this.notebook = notebook;
	}
	
	@Override
	public void work() {
		System.out.println(job + "는 코딩을 합니다");
	}
	
	@Override
	public void hobby() {
		String[] arData = {"A","B","C","D"};
		for(int i = 0; i<arData.length; i++) {
			System.out.print(arData[i] + " ");
		}		
		System.out.println();
	}
	
	public void isNotebook() {
		if(notebook = true) {
			System.out.println("노트북이 있습니다.");
		}else {
			System.out.println("노트북이 없습니다.");
		}
		
	}
	
	
	

}
