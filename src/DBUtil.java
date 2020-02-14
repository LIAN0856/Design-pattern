import java.sql.Connection;

public class DBUtil {
	public Connection getConnection() {
		try {
		System.out.println("数据库连接成功");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;	
	}
}
