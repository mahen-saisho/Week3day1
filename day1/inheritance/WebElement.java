package week3.day1.inheritance;

public class WebElement {

	public void click() {
		System.out.println("Base class from Webelement in Click method");
	}
	
	public void setText(String text) {
		text = "Base to Subclass";
		System.out.println("Base class form Webelement in setText "+text);
		
	}
	
}
