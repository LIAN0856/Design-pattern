package kaibiyuanze;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		LoginForm loginform1=new LoginForm();
		Scanner input=new Scanner(System.in);
		System.out.println("�����������õİ�ťͼ�Σ�");
		loginform1.setButton(input.next());
		loginform1.display();
	}
}
