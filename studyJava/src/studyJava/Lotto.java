package studyJava;

public class Lotto {
	private String id;
	
//	getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
//	기본 생성자
	public Lotto() {;}
	
//	초기화 생성자
	public Lotto(String id) {
		this.id = id;
	}
	
	public String[] drawNumber() {
//	로또번호 생성
//	drawNumber()를 사용하여 추첨한다. 추첨은 아래와 같다.
//	- 1 ~ 45까지의 랜덤한 숫자를 6개 추출한다.
//	- 추출한 번호는 문자열 배열로 로또번호(lottoNumbers) 필드에 담아주는 기능을 가진 메서드이다.
    String[] luckyNumberArray = new String[6];

    for(int i = 0; i < 6; i++) {
        luckyNumberArray[i] = String.valueOf((int)Math.floor((Math.random() * 45 + 1)));
        for(int j = 0; j < i; j++) {
            if(luckyNumberArray[j].equals(luckyNumberArray[i])) {
                i--;
                break;
            }
        }
    }
    return luckyNumberArray;
}	

	
	
	public void sellLotto() {
//		- 해당 메서드를 사용하면, 회사원 또는 연구원에게만 로또를 판매하는 기능을 가진 메서드이다.
//		(즉 회사원 또는 연구원의 필드에 접근하여 로또 번호를 입력할 수 있다.)
		
	}
	
	public void checkLotto(String job, String[] numbers, String[] userNumbers) {
//		- 로또의 구매는 회사원과 연구원만 구매할 수 있으며 checkLotto 메서드로 당첨자를 확인하여 값을 리턴하는 메서드이다.
//		로또를 구매하는 회사원과 연구원이 아닌 경우 "로또를 구매할 수 없습니다"를 출력한다.
//		- 로또는 모든 번호가 맞으면 당첨 아니면 꽝! 둘중 하나로만 결과를 알려주는 메서드이다
		Person person = new Person();
        if (job.equals("연구원")) {
            person = new Researcher();
        } else if (job.equals("회사원")) {
            person = new Employee();
        } else {
            System.out.println("로또를 구매할 수 없습니다");
            return;
        }
        
        int count = 0;
        for (String userNum : userNumbers) {
            for (int i = 0; i < numbers.length; i++) {
                if (userNum.equals(numbers[i])) {
                    count++;
                    break; 
                }
            }
        }
        
//		회사원 업캐스팅
		Person 회사원= new Employee("A", "일당백", 20, "01077776666","IT");
//		회사원 다운캐스팅
		Employee 회사원A = (Employee)회사원;
		
//		연구원 업캐스팅
		Person 연구원 = new Researcher("B", "한우물", 35, "01044467878", "식물연구");
//		연구원 다운캐스팅
		Researcher 연구원B = (Researcher)연구원;
        
        if (count == 6) {
        	System.out.println("당첨!");
        	if(job.equals("회사원")) {
            	회사원A.byeCompany();
            	회사원A.saveMoney();
		   }
        	if(job.equals("연구원")) {
            	연구원B.buyFood();
            	연구원B.investLab();
		   }
        }else {
           System.out.println("꽝..");
           if(job.equals("회사원")) {
        	System.out.println("다시 일한다");
        	System.out.println("다시 돈번다");
		   }
       	if(job.equals("연구원")) {
       		System.out.println("나에게 투자한다");
       		System.out.println("집에 쌀을 산다");
		   }
        }
    }	
	
}
