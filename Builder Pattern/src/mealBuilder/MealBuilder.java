package mealBuilder;

public abstract class MealBuilder {
	protected Meal meal;
	
	public Meal getMeal(){
		return meal;
	}
	
	public void createNewMeal(){
		meal = new Meal();
	}
	
	public abstract void buildToppings();
	public abstract void buildSauce();
	public abstract void buildTypeMeal();
}
