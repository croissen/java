package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import optionalTest.User2;

public class StreamTask3 {
	public static void main(String[] args) {
		
//    1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		ArrayList<Integer> plus = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
//		int result = plus.stream().reduce(0, Integer::sum);
//	    System.out.println(result);

//		int result = plus.stream().reduce(0, (a, b) -> a + b);
		Optional<Integer> result = plus.stream().reduce((a, b) -> a + b);// 오류가 터지지 않도록 하는 객체
//		System.out.println(result);
	    
//      1) 1~10까지 ArrayList에 담고 출력하기
	    ArrayList<Integer> misson1 = new ArrayList<Integer>();
//	    for(int i=0; i<10; i++) {
//	    	misson1.add(i + 1);
//	    }
//	    for(int i=0; i<10; i++) {
//	    	System.out.println(misson1.get(i));
//	    }
	    IntStream.rangeClosed(1, 10).forEach(n -> {misson1.add(n);});
//	    misson1.forEach((n)-> {System.out.println(n);});
	    

//      2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기
	    ArrayList<Integer> misson2 = new ArrayList<Integer>();
	    IntStream.rangeClosed(1, 10).filter((n) -> n % 2 == 1).forEach((num) -> {misson2.add(num);});
//	    misson2.forEach((n) -> {System.out.println(n);});
	    
	    
//      3) 1~10까지 ArrayList에 짝수만 담고 출력하기
	    ArrayList<Integer> misson3 = new ArrayList<Integer>();
	    IntStream.rangeClosed(1, 10).filter((n) -> n % 2 == 0).forEach((num) -> {misson3.add(num);});
//	    misson3.forEach(System.out::println);
	    
//      4) a~z까지 ArrayList에 담고 출력하기
	    ArrayList<Integer> misson4 = new ArrayList<Integer>();
//	    IntStream.rangeClosed('a', 122).forEach((c) -> {System.out.print((char)c);});
	    
//	    4-1) a~z까지 A~Z로 변경해서 출력하기
	    ArrayList<String> misson41 = new ArrayList<String>();
//	    IntStream.rangeClosed(97 - 32, 122 - 32).forEach((c) -> {System.out.print((char)c);});
	    
	    
//      5) a~z까지 ex) aceg... 하나씩 건너뛰고 ArrayList에 담고 출력하기
	    ArrayList<String> misson5 = new ArrayList<String>();
//	    IntStream.rangeClosed(97, 122).filter((n) -> n % 2 == 1).forEach((c) -> {System.out.print((char)c);});
	    
//      6) 1~30까지 ArrayList에 담고 10~20만 출력하기
	    ArrayList<Integer> misson6 = new ArrayList<Integer>();
//	    IntStream.rangeClosed(1, 30)
//	    		 .filter((n) -> n <= 20)
//	    		 .filter((n) -> n >= 10)
//	    		 .forEach((num) -> {System.out.print(num + " ");});
	    
//      7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기
	    ArrayList<Integer> misson7 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	    int resultMisson7 = misson7.stream()
	    						   .filter((n) -> n % 2 == 0)
	    						   .reduce(0, (a, b) -> a + b);
//	    System.out.println(resultMisson7);

	    
//      8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기
	    ArrayList<String> misson8 = new ArrayList<String>(Arrays.asList("hello", "java", "apple", "test"));
//	    misson8.stream().filter(str -> str.contains("a")).forEach(System.out::println);;
	    
//      9) 1~10까지 ArrayList에 담고 모든 합을 출력하기
//	    ArrayList<Integer> misson9 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//	   	int resultMisson9 = misson9.stream().reduce(0, (a, b) -> a + b);
//	   	System.out.println(resultMisson9);
	    	   
//      10) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
	    ArrayList<Integer> misson10 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
	   	int resultMisson10 = misson10.stream().reduce(0, (a, b) -> a + b);
//	   	System.out.println(resultMisson10);

	    
	
//    2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//    모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 데이터를 출력한다.
//
//    필드 : 이름, 취미, 소개
//    홍길동, 축구_농구_야구, 나는 축구왕!
//    이순신, 개발_당구_축구, 나는 개발자 좋아!
//    장보고, 피아노, 피아노만 한 우물!
//    김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//    김영희, 골프_야구, 운동 선수는 나의 꿈
//    흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
	   	
	   	ArrayList<Member> users = new ArrayList<Member>(Arrays.asList(
				new Member("홍길동", "축구_농구_야구", "나는 축구왕!"),
				new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!"),
				new Member("장보고", "피아노", "피아노만 한 우물!"),
				new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~"),
				new Member("김영희", "골프_야구", "운동 선수는 나의 꿈"),
				new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!")
				));
//	    users.stream()
//	    	 .filter(str -> str.getHobby()
//	    	 .contains("개발"))
//	    	 .forEach(System.out::println);
	    
	}
}
