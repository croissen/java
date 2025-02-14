package studyJava;

import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0; 
        int total = 0;

        // 점수 입력 받기
        score = sc.nextInt();
        switch(score){
        case 1:
        	System.out.println("봄");
           break;
        case 2:
        	System.out.println("여름");
           break;
        case 3:
        	System.out.println("가을");
           break;
        case 4:
        	System.out.println("겨울");
        	break;
        default:
        	System.out.println("뭔소리야");
           break;
        }
        
    }
}
