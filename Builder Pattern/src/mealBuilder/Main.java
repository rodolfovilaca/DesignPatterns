package mealBuilder;

public class Main {
	
	public static void main(String[] args) {
		Chef chef = new Chef();
		
		MealBuilder burguerBuilder =  new BurguerBuilder();
		MealBuilder pastaBuilder = new PastaBuilder();
		
		chef.setMealBuilder(burguerBuilder);
		chef.constructMeal();
		
		Meal burguer = chef.getMeal();
		burguer.printMeal();
		
		chef.setMealBuilder(pastaBuilder);
		chef.constructMeal();
		
		Meal pasta = chef.getMeal();
		pasta.printMeal();
	}
}
