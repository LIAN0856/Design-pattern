package kaibiyuanze;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		LoginForm loginform1=new LoginForm();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你想用的按钮图形：");
		loginform1.setButton(input.next());
		loginform1.display();
	}
}
