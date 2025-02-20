package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringTask2 {
	public static void main(String[] args) {
//		5개의 문자열을 모두 소문자로 변경하기
//		"Black", "WHITE", "reD", "yeLLow", "PINk"
		ArrayList<String> task1 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		task1.stream().map(String::toLowerCase).forEach(System.out::println);;

//		Collection<String> task11 = task1.stream().map(String::toLowerCase).collect(Collectors.toCollection(ArrayList::new));
//		System.out.println(task11);
		

//		2) Apple, banana, Melon, cherry, "딸기"
//		단어중 영어면서, 앞글자가 대문자인 단어만 출력하기
		ArrayList<String> task2 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "cherry", "딸기"));
//		task2.stream()
//			.filter(str -> str.charAt(0) >= 'A')
//			.filter(str -> str.charAt(0) <= 'Z')
//			.forEach(System.out::println);
		
		
//		3) 한글을 정수로 변경
//		"일공이사" -> 1024
//		String hangle = "공일이삼사오육칠팔구";
//		String data = "일공이사";
//		data.chars().map(c -> hangle.indexOf(c)).forEach(System.out::print);
		
		
		
//		4) 정수를 한글로 변경
//		"1024" -> "일공이사"
	      String hangle2 = "공일이삼사오육칠팔구";
	      String data2 = "102423";   

//	      data2.chars().map(c -> c - 48).forEach(i -> System.out.print(hangle2.charAt(i)));
	      
	      
//	    추가  
	        String data3 = "cont";
	        char find = 'c';

	        long count = data3.chars().filter(c -> c == find).count();
	        System.out.println(count);

	      
	      
	}
}
