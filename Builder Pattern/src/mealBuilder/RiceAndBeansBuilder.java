package mealBuilder;

import mealBuilder.Meal.typeMeal;

public class RiceAndBeansBuilder extends MealBuilder{

	@Override
	public void buildToppings() {
		meal.setTopping("Steak");
	}

	@Override
	public void buildSauce() {
		meal.setSauce("Molho Madeira");
	}

	@Override
	public void buildTypeMeal() {
		meal.setTypeMeal(typeMeal.RICE_AND_BEANS);
	}

}
