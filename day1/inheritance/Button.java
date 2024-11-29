package week3.day1.inheritance;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("Submit function printed from Button sub-class");
	}
	
	public static void main(String[] args) {
		Button value=new Button();
		value.click();
		value.setText("Text");
	}
}
