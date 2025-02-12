package anonymousTest;

//	가입양식
//	메뉴받기, 판매
public interface Form {
	public String[] getMenus();
	public void sell(String menu);

	public String[] getFrees();
	public void freeShare(String free);
}
