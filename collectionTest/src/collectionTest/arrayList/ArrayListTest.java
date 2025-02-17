package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
//		<?> : 제네릭 = 포괄적인	, 이름이 없는 
//		객체화 시 타입을 지정하는 기법
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운 캐스팅을 할 필요가 없으며, 지정할 타입에 제한을 줄 수 있다.
//	T data;
//	
//	{
//		this.data;
//	}
//	
	public static void main(String[] args) {
		
		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size());
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(80);
		datas.add(90); 
		datas.add(60); 
		System.out.println(datas.size());
		
		try {
			datas.get(2);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 똑바로 입력");
			e.printStackTrace();
		} catch (Exception e) {

		}
		
		
//		for(int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
		System.out.println(datas);
		
//		실습
		
//		Collections.shuffle(datas);
		
		try {
			datas.add(datas.indexOf(50) + 1 , 500);
			System.out.println(datas);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 똑바로 입력");
			e.printStackTrace();
		} catch (Exception e) {
		}
		
//		수정	(90 -> 9)
		if(datas.contains(90)) {
			int prev = datas.set(datas.indexOf(90), 9);
			try {
				System.out.println("이전 값 = " + prev);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 오류");
				e.printStackTrace();
			} catch (Exception e) {
			}
		}
//		80을 인덱스로삭제
//		if(datas.contains(80)) {
//			int prev = datas.remove(datas.indexOf(80));
//			try {
//				System.out.println("삭제된 값 = " + prev);
//			} catch (IndexOutOfBoundsException e) {
//				System.out.println("인덱스 오류");
//				e.printStackTrace();
//			} catch (Exception e) {
//			}
//		}
		
//		80을 값으로 삭제 		
		if(datas.contains(80)) {
			boolean prev = false;
			try {
//				WrapperClass 랩퍼 클래스
//				작은 것을 큰것으로 감싸는 것
				
				prev = datas.remove(Integer.valueOf(80)); 
				System.out.println("삭제 여부 = " + prev);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 오류");
				e.printStackTrace();
			} catch (Exception e) {
			}
		}
		System.out.println(datas);
		
		
		
		
	}
	
}
