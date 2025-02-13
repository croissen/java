package objectTest;

public class Sports {
//	1. 기본 생성자			ctrl + space + enter
//	2. 초기화 생성자		alt shift s o
//	3. private 붙이기		alt + Shift + a
//	4. getter setter	alt shift s r alt + a r	
//	5. toString 재정의	alt shift s s
	
//	alt + Shift + a
	private String type;
	private int total;
	
	public Sports() {;}	
	
//	alt shift s o
	public Sports(String type, int total) {
		super();
		this.type = type;
		this.total = total;
	}
	
//	alt shift s r alt + a r // getter setter
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
//	alt shift s s
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}
	
	public static void main(String[] args) {
		Sports sports = new Sports();
		System.err.println(sports.hashCode());
//		sports.hashCode();
		System.out.println(sports.toString()); //
//		sports.toString();
		System.out.println(sports.equals(sports));
//		sports.equals(sports);
		
		
	}

	

	

	
}
