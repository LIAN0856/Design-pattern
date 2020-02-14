
public class LoginForm {
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
}
