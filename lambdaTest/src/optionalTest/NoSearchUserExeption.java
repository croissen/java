package optionalTest;

public class NoSearchUserExeption extends RuntimeException{
	public NoSearchUserExeption() {;}
	public NoSearchUserExeption(String message) {
		super(message);
	}
	
}
