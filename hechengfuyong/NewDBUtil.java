package hechengfuyong;

import java.util.ArrayList;
import java.util.List;

public class NewDBUtil extends DBUtil{
		public String getConnection() {
			return"数据库连接成功！";
		}
		public void find() {
			List<Character> list=new ArrayList();
			list.add('a');
			list.add('b');
			list.add('c');
			System.out.println("所有元素为："+list);
		}
}
