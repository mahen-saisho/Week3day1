package week3.day1.inheritance;

public class TestData {
	
	public void enterCredentials() {
		System.out.println("Print enterCredentials method");
	}
	public void navigateToHomePage() {
		System.out.println("Print navigateToHomePage");
	}
	public static void main(String[] args) {
		TestData enter = new TestData();
		enter.enterCredentials();
		enter.navigateToHomePage();
	}

}
