package hechengfuyong;

import java.util.ArrayList;
import java.util.List;

public class NewDBUtil extends DBUtil{
		public String getConnection() {
			return"���ݿ����ӳɹ���";
		}
		public void find() {
			List<Character> list=new ArrayList();
			list.add('a');
			list.add('b');
			list.add('c');
			System.out.println("����Ԫ��Ϊ��"+list);
		}
}
