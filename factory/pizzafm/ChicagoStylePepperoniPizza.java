package learning.factory.pizzafm;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Pepperoni Pizza ******************** shushine ************************at 9/2 10:24";
		********************************************* sunshine ****************
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
