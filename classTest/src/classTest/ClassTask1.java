package classTest;

class Market{
//	상품, 가격, 재고
//	sell() 메서드
	int sell;
	String item;
	int cost;
	int empty;
	
	
	public Market(){}
	public Market(String item, int cost, int empty){
		this.item = item;
		this.cost = cost;
		this.empty = empty;
	}
	
	void sell(Customer customer) {
		 empty --;
		 System.out.println("할인된 가격 : " +  cost * (customer.sale / 100.0));
		 customer.money -= cost - cost * (customer.sale / 100.0);
	 }
}

class Customer {
//	이름, 전화번호, 돈, 할인율
	String name;
	String number;
	int money;
	int sale;
	public Customer(){}
	public Customer(String name, String number, int money, int sale){
		this.name = name;
		this.number = number;
		this.money = money;
		this.sale = sale;
	}
}

public class ClassTask1{
	public static void main(String[] args) {
//		sell() 사용
//		사람의 돈 출력
//		마켓 상품의 재고 출력
		Market items = new Market("apple", 2000, 10);
		Customer cs = new Customer("곽승민", "010-1234-5678", 10000, 20);
		items.sell(cs);
		System.out.println(cs.name + "이 " + items.item + "을 구매했어요.\n" + (cs.money - items.sell));
		System.out.println(items.item + "의 재고는 " + items.empty + "개" );
		

		
	}
}



