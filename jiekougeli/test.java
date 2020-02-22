package jiekougeli;

public class test {

	public static void main(String[] args) {
		ClientA a=new ClientA();
		a.depend1(new ConcreteService());
		ClientB b=new ClientB();
		b.depend2(new ConcreteService());
		ClientC c=new ClientC();
		c.depend3(new ConcreteService());
	}
}
