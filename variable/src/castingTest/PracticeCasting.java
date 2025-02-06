package castingTest;

public class PracticeCasting {
	public static void main(String[] args) {
//		num1=1  String str1 = "8.24", str2 = "7.8", 115 만들기
		int num1 = 1;
		String str1 = "8.24", str2 = "7.8";
		double doubStr1 = Double.parseDouble(str1);
	    double doubStr2 = Double.parseDouble(str2);
	    int plusStr = (int)doubStr1 + (int)doubStr2;
		System.out.printf("%d%d\n",num1,plusStr);
		
		
		
//		akj로 AKJ만들기
		int a = 'a'- 32;
		int k = 'k'- (char)32;
		int j = 'j'- (char)32;
		System.out.println((char)a + "," + (char)j + "," + (char)k);
		
//		  String strA = "12.123";
//	      String strB = "345.789";
//	      String strC = "6789.456";
		
		  String strA = "12.123";
	      String strB = "345.789";
	      String strC = "6789.456";
	      double dStrA = Double.parseDouble(strA);
	      double dStrB = Double.parseDouble(strB);
	      double dStrC = Double.parseDouble(strC);
	      int iStrA = (int)dStrA;
	      int iStrB = (int)dStrB;
	      int iStrC = (int)dStrC;
	      String result = "" + iStrA + iStrB + iStrC;
	      System.out.print(result);
	      
	}
}
