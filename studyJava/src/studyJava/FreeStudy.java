package studyJava;

import java.util.Random;
import java.util.Scanner;

public class FreeStudy {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	int lottoAr[] = new int[6];
	int userAr[] = new int[6];
	int count = 0;
	
	for(int i = 0; i < 6; i++) {
		lottoAr[i] = random.nextInt(45) +  1;
	}
	
	System.out.println("숫자 6개 입력");
	for(int i = 0; i < 6; i++) {
		userAr[i] = sc.nextInt();
	}
	
	for(int j=0; j<6; j++) {
	for(int i=0; i<6; i++) {
		if(lottoAr[j] == userAr[i]) {
			count++;
			
			
				}
			}	
		}
	if(count == 6) {
		System.out.println("1등입니다.");
	}else if(count == 5) {
		System.out.println("2등입니다.");
	}
	
	System.out.println(lottoAr[0]);
	
	}
}
		

