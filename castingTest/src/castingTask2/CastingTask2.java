package castingTask2;

import java.util.Scanner;
class Monster {
	public Monster() {;}
	public void hunt () {
		System.out.println();
	}
}
class Ork extends Monster{
	public Ork() {;}
	public void hunt() {
		System.out.println("가죽을 획득하였습니다.");
	}
}
class Angel extends Monster{
	public Angel() {;}
	public void hunt() {
		System.out.println("날개를 획득하였습니다");
	}
}
class Human extends Monster{
	public Human() {;}
	public void hunt() {
		System.out.println("갑옷을 획득하였습니다");
	}
}

public class CastingTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		오크, 요정, 인간을 사냥할 수 있다.
		Charactor zeratul = new Charactor("제라툴","암살자", 2000);
		Monster ork = new Ork();
		Monster angel = new Angel();
		Monster human = new Human();
		
		System.out.println(zeratul.name + ", 당신의 직업은 '" + zeratul.job + "'입니다.(" + zeratul.level + "레벨)");
		System.out.println("사냥할 몹을 고르시오.\n1. 오크\n2. 요정\n3. 인간");
		int choice = sc.nextInt();
		if(choice == 1) {
			Ork orkHunt = (Ork)ork;
			orkHunt.hunt();
		}else if(choice == 2) {
			Angel angelHunt = (Angel)angel;
			angelHunt.hunt();
		}else if(choice == 3) {
			Human humanHunt = (Human)human;
			humanHunt.hunt();
		}else {
			System.out.println("보기에 있는것만 골라주세요..");
		}
		
		
	}
}






