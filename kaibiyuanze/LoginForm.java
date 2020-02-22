package kaibiyuanze;

public class LoginForm {
    String button;
	public String getButton() {
		return button;
	}
	public void setButton(String button) {
		this.button = button;
	}
	public void display() {
		if(button.equals("Circle")) {
			AbstractButton Button=new CircleButton();
			Button.view();
		}
		else {
			AbstractButton Button=new RectangleButton();
			Button.view();
		}
		System.out.println("µÇÂ¼³É¹¦£¡");
	}
}
