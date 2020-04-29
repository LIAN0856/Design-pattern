package Factory;

public class ClientClass {
	
	public static void main(String[] args) {
		//Factory factor=new Factory();
		//Fruit fruit=factor.CreateFruit("A");
		Factory factor=(Factory)XMLUtil.getBean();
		Fruit fruit=factor.CreateFruit();
		fruit.eat();
	}
	
	/*public String factory(String fruitname)
	{
		if(fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}*/
}
