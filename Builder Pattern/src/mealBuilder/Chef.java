package mealBuilder;

public class Chef {
	private MealBuilder builder;
	
	public void setMealBuilder(MealBuilder builder){
		this.builder = builder;
	}
	
	public Meal getMeal(){
		return builder.getMeal();
	}
	
	public void constructMeal(){
		builder.createNewMeal();
		builder.buildToppings();;
		builder.buildSauce();
		builder.buildTypeMeal();
	}
}
