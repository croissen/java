package studyJava;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
//		회사원 업캐스팅
		Person 회사원= new Employee("A", "일당백", 20, "01077776666","IT");
//		회사원 다운캐스팅
		Employee 회사원A = (Employee)회사원;
		
//		연구원 업캐스팅
		Person 연구원 = new Researcher("B", "한우물", 35, "01044467878", "식물연구");
//		연구원 다운캐스팅
		Researcher 연구원B = (Researcher)연구원;
		
//		- 로또 클래스 drawNumber() 사용한다
		Lotto lotto = new Lotto();
		String[] lottoNumber = lotto.drawNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("당첨번호");
	       for (String luckyNum : lottoNumber) {
	            System.out.print(luckyNum + " ");
	    }
	       
	       
       System.out.println("\n\n당신의 직업을 입력하세요.");
       String job = sc.next();
       System.out.println("\n로또 번호 6개를 입력하세요:");
       String[] userNumbers = new String[6];
           for (int i = 0; i < 6; i++) {
		       if (job.equals("연구원")) {
		           person = new Researcher();
		       } else if (job.equals("회사원")) {
		           person = new Employee();
		       } else {
		           System.out.println("로또를 구매할 수 없습니다");
		           return;
		       }
		       
//		- sellLotto() 사용하여 연구원, 회사원에게 각각 로또 판매한다
		       if(job.equals("연구원") || job.equals("회사원")) {
				   	userNumbers[i] = sc.next();
			   }
           }
            
           lotto.checkLotto(job, lottoNumber, userNumbers);


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
