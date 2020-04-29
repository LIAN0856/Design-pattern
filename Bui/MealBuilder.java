package Bui;

public abstract class MealBuilder {
	protected Meal meal=new Meal();
	public Meal getMeal()
	{
		return meal;
	}
	public abstract void buildDrink();
	public abstract void buildFood();
}
