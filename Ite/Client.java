package Ite;

public class Client {
	
	public static void display(Television tv){
		TVIterator i=tv.createIterator();
		System.out.println("���ӻ�Ƶ����");
		while(!i.isLast())
		{
			System.out.println(i.currentChannel());
			i.next();
		}
	}
	
	public static void main(String[] args) {
		Television tv1 =new SKyworthTelevision();
		Television tv2 =new TCLTelevision();
		display(tv1);
		display(tv2);
	}
}
