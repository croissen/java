package controlStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String Q = "1월부터 12월까지 입력하세요", seasonResult = "";
		int month = 0,  season = 0;
		
		month = sc.nextInt();
		if(month > 0 && month <= 12) {
			season = month / 3 % 4;
		
			switch(season) {
			case 0 :  
				seasonResult = month + "월은 겨울입니다.";
			break;	
			case 1 :  
				seasonResult = month + "월은 봄입니다.";
				break;	
			case 2 :  
				seasonResult = month + "월은 여름입니다.";
				break;	
			case 3 :  
				seasonResult = month + "월은 가을입니다.";
				break;	
			default : 
				seasonResult = "달은 12월까지바께 없어유";
				break;
		}
	}else {
		seasonResult = "달은 12월까지 바께 없어유";
	}
		System.out.println(seasonResult);
		
	}
}
