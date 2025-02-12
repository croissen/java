package anonymousTest;

//	실습
//	잠실점오픈
//	무료나눔 행사중
//	무료나눔 행사중이라면, "무료나눔 행사 승인" 출력
//	무료나눔 행사중이 아니라면, 판매

public class Building {
	public static void main(String[] args) {
		
		System.out.println("강남점");
		Starbucks gangnam = new Starbucks();
		gangnam.register(new Form() {
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenus();
				for(int i = 0 ; i < menu.length(); i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menus[i] + " 판매완료");
						break;
					}
				}
			}
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}

			@Override
			public void freeShare(String free) {
				String[] frees = getFrees();
				for(int i = 0 ; i < free.length(); i++) {
					if(frees[i].equals(free)) {
						System.out.println(frees[0]);
						break;
					}
				}
				
			}
			@Override
			public String[] getFrees() {
				return new String[] {"판매중", "무료행사중"};
			}
		});
		
		
//		잠실점 등록
		System.out.println("\n잠실점");
		Starbucks jamsil = new Starbucks();
		jamsil.register(new Form() {
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenus();
				for(int i = 0 ; i < menu.length(); i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menus[i] + " 무료나눔 행사 승인");
						break;
					}
				}
			}
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}
 
			@Override
			public void freeShare(String free) {
				String[] frees = getFrees();
				for(int i = 0 ; i < free.length(); i++) {
					if(frees[i].equals(free)) {
						System.out.println(frees[1]);
						break;
					}
				}
				
			}
			@Override
			public String[] getFrees() {
				return new String[] {"판매중", "무료행사중"};
			}
			
		});
		
	}
}
