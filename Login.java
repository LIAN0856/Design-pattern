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
		{System.out.println("�û�������Ϊ��");}
		if((userPassword==null))
		{System.out.println("���벻��Ϊ��");}
	}
	public Connection getConnection() {
		try {
		System.out.println("���ݿ����ӳɹ�");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;	
	}
	public void finduser(String userName,String userPassword) {
		boolean b=true;
		if(b=true) {System.out.println("��¼�ɹ���");} 
		else {System.out.println("��¼ʧ�ܣ�");}
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������û���������");
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
