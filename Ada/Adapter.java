package Ada;

import pro.MyFruit;

public class Adapter extends OldJuicer implements InewJuicer{
	public String newPort(MyFruit fruit1,MyFruit fruit2) {
		String str="��Ϲ�֭��"+onePort(fruit1);
		str+=onePort(fruit2);
		return str;
	}
}
