package mealBuilder;

import mealBuilder.Meal.typeMeal;

public class PastaBuilder extends MealBuilder{

	@Override
	public void buildToppings() {
		meal.setTopping("Meatballs");
	}

	@Override
	public void buildSauce() {
		meal.setSauce("Tomatoes Sauce");
	}

	@Override
	public void buildTypeMeal() {
		meal.setTypeMeal(typeMeal.PASTA);
	}

}
