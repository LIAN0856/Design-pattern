import java.sql.Connection;
import java.util.Scanner;

public class Login {
	String userName;
	String userPassword;
	public void init(String userName,String userPassword) {
		this.userName=userName;
		this.userPassword=userPassword;
	}
	public void display() {
		System.out.println("userName:"+userName);
		System.out.println("userPassword:"+userPassword);
	}
	public void validate() {
		if((userName==null)||(userName.length()<1))
		{System.out.println("用户名不能为空");}
		if((userPassword==null))
		{System.out.println("密码不能为空");}
	}
	public Connection getConnection() {
		try {
		System.out.println("数据库连接成功");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;	
	}
	public void finduser(String userName,String userPassword) {
		boolean b=true;
		if(b=true) {System.out.println("登录成功！");} 
		else {System.out.println("登录失败！");}
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入用户名和密码");
		String userName=input.next();
		String userPassword=input.next();
		Login login=new Login();	
        login.init(userName,userPassword);
        login.display();
        login.validate();
        login.getConnection();
        login.finduser(userName,userPassword);
	}

}
