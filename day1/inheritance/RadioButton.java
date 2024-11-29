package week3.day1.inheritance;

public class RadioButton extends Button{
	
	public void selectRadioButton() {
		System.out.println("selectRadioButton method inherit from Button");
		
	}
	public static void main(String[] args) {
		RadioButton btn = new RadioButton();
		btn.selectRadioButton();
		btn.submit();
	}


}
