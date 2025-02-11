package castingTask1;

import java.util.Scanner;

class Netflix {
	public Netflix() {;}
}

class Animation extends Netflix{
	public Animation() {;}
	void play() {
		System.out.println("자막지원");
	}
}

class Movie extends Netflix{
	public Movie() {;}
	void play() {
		System.out.println("4D");
	}
}

class Drama extends Netflix{
	public Drama() {;}
	void play() {
		System.out.println("굿즈");
	}
}


//	넷플릭스
//	애니메이션, 영화, 드라마 클래스 +@ 클래스
//	사용자가 선택한 영상이 
//  애니라면 "자막지원" 기능 사용
//	영화라면 "4D"기능 사용
//	드라마라면 "굿즈" 기능 사용(출력)

public class CasintTask {
	public static void main(String[] args) {
		Netflix video = new Netflix();
		
		Netflix ani = new Animation();
		Animation anime = (Animation)ani;
//		anime.play();
		
		Netflix mo = new Movie();
		Movie mov = (Movie)mo;
//		mov.play();
		
		Netflix dr = new Drama();
		Drama dra = (Drama)dr;
//		dra.play();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 드라마\n2. 애니메이션\n3. 영화\n중 선택");
		int choice = sc.nextInt();
		if(choice == 1) {
			dra.play();
		}else if(choice == 2) {
			anime.play();
		}else if(choice == 3) {
			mov.play();
		}else {
			System.out.println("보기에 있는것만 골라주세요..");
		}
		
	}
	
}
