package anonymousTest;

public class Starbucks {
	public void register(Form form) {
		String[] menu = form.getMenus();
		for(int i = 0 ; i < menu.length; i++) {
			System.err.println(i + 1 + "." + menu[i]);
		}
		
//		판매  or 무료나눔을 하고 있는 곳인지 판별
		form.sell("디카페인");
		form.freeShare("무료행사중");
		

	}
}
