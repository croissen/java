package lambdaTask;

public class LambdaResult {
	public static void main(String[] args) {
		PrintName myName = (firstName, lastName) -> firstName + lastName;
		System.out.println(myName.fullName("곽", "승민"));

	}
}
