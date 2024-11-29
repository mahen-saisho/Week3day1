package week3.day1.inheritance;

public class CheckBoxButton extends Button{
	
	public void clickCheckButton() {
		System.out.println("clickCheckButton New method inherit from button");
	}
	public static void main(String[] args) {
		CheckBoxButton btn = new CheckBoxButton();
		btn.clickCheckButton();
		btn.submit();
	}

}
