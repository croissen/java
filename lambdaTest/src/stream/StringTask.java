package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class StringTask {
	public static void main(String[] args) {
//		1~10까지 ArrayList 에 담고 출력하기
		ArrayList<Integer> task1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		task1.stream().forEach(System.out::println);

//		ArrayList<Integer> task1 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
		
//		ABCDEF를 각 문자별로 출력하기
		ArrayList<String> task2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
//		task2.stream().forEach(System.out::println);
		
//		"ABCDEF".chars().forEach(c -> System.out.println((char)c));
		
//		1~100까지 홀수만 ArrayList에 담고 출력학기
		ArrayList<Integer> task3 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter((n) -> n % 2 == 1).forEach((num) -> {task3.add(num);});
		IntStream.rangeClosed(1, 100).filter((n) -> n % 2 == 1).forEach(task3::add);
//		task3.forEach(System.out::println);
		
		
//		A~F중 D 를 제외하고 ArrayList에 담고 출력하기
//		ArrayList<String> task4 = new ArrayList<String>(Arrays.asList("A","B","C","E","F"));
//		task4.stream().forEach(System.out::println);
		ArrayList<Character> task4 = new ArrayList<Character>();
		IntStream.rangeClosed('A', 'E').map(c -> c > 67 ? c + 1  : c ).forEach(c -> task4.add((char)c));
//		IntStream.rangeClosed('A', 'E').map(c -> c > 67 ? c + 1 : c ).forEach(c -> task4.add((char)c));
//		task4.forEach(System.out::println);
	
		
		
		
		
		
	}
}
