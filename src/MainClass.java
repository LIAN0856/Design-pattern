import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������û���");
		String userName=input.next();
		System.out.println("����������");
		String userPassword=input.next();
		LoginForm loginform=new LoginForm();	
		loginform.init(userName,userPassword);
	    loginform.display();
	    loginform.validate();
	    DBUtil dbutil=new DBUtil();
	    dbutil.getConnection();
	    UserDAO userdao=new UserDAO();
	    userdao.finduser(userName,userPassword);
	}
}
