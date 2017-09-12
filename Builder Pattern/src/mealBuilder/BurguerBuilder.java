package mealBuilder;

import mealBuilder.Meal.typeMeal;

public class BurguerBuilder extends MealBuilder{

	@Override
	public void buildToppings() {
		meal.setTopping("Cheese");
	}

	@Override
	public void buildSauce() {
		meal.setSauce("Barbecue");
	}

	@Override
	public void buildTypeMeal() {
		meal.setTypeMeal(typeMeal.BURGUER);
	}

}
