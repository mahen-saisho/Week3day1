package week3.day1.inheritance;

public class LoginTestData {

	public void enterUsername() {
		System.out.println("Print the enterUsername");
	}
	public void enterPassword() {
		System.out.println("Print the enterPassword");
	}
	
	public static void main(String[] args) {
		LoginTestData login = new LoginTestData();
		login.enterUsername();
		login.enterPassword();
	}
}
