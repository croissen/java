package studyJava;

public class Person {
	private String id;
	private String name;
	private int age;
	private String phone;
	private String job;
	
//	기본 생성자
	public Person() {;}
	
//	초기화 생성자
	public Person(String id, String name, int age, String phone, String job) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.job = job;
	}
	
//	getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
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

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	void work () {
		System.out.println("일을 합니다");
	}
	
}
class Employee extends Person{
	private String lotto;
	private String company;
	
//	기본 생성자
	public Employee() {;}
	
//	초기화 생성자
	public Employee(String id,String name,int age,String phone,String job) {
		super(id, name, age, phone, job);
		this.lotto = lotto;
		this.company = company;
	}
	
//	getter, setter
	public String getLotto() {
		return lotto;
	}
	public void setLotto(String lotto) {
		this.lotto = lotto;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	void work () {
		System.out.println("은 하루종일 일을한다");
	}
	void byeCompany () {
		System.out.println("직장을 그만둔다");
//			1등이 아닐 시 콘솔에 “다시 일한다”를 출력한다.
	}
	void saveMoney () {
		System.out.println("전액을 저축한다");
//			1등이 아닐 시 콘솔에 “다시 돈 번다”를 출력한다.
	}
	
}
class Researcher extends Person{
	private String lotto;
	private String search;
	
//	기본 생성자
	public Researcher() {;}
//	초기화 생성자
	public Researcher(String id,String name,int age,String phone,String job) {
		super(id, name, age, phone, job);
		this.lotto = lotto;
		this.search = search;
	}
	
//	getter, setter
	public String getLotto() {
		return lotto;
	}
	public void setLotto(String lotto) {
		this.lotto = lotto;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	@Override
	void work () {
		System.out.println("연구원은 중이다.");
	}
	void  investLab () {

		System.out.println("연구에 투자한다");
	}
	void  buyFood () {
		System.out.println("지인에게 밥을 산다");

	}


}
