package mealBuilder;

public class Meal {
	 	protected enum typeMeal {
	 			BURGUER,RICE_AND_BEANS,PASTA
	 	}
	 	private typeMeal type;
	    private String sauce = "";
	    private String topping = "";

	    public void setTypeMeal(typeMeal type) {
	        this.type = type;
	    }

	    public void setSauce(String sauce) {
	        this.sauce = sauce;
	    }

	    public void setTopping(String topping) {
	        this.topping = topping;
	    }
	    
	    public void printMeal(){
	    	System.out.println("This is a "+this.type+" meal with "+this.topping+" and "+this.sauce);
	    }
}
