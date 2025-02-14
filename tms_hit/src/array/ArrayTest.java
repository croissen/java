package array;

public class ArrayTest {
	public static void main(String[] args) {
		String[] lotto = new String[6];
//		System.out.println(Math.random() * 45);
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = String.valueOf((int)Math.floor(Math.random() * 45))  ;
//			값으로 볼 즐 알아야 함
		}
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		
	}
}
