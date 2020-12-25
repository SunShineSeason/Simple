package learning.factory.pizzafm;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza***I love you!!!!!";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");

		This is changed By Local !!!!!!!!
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
