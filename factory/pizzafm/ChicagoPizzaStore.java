package learning.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {
	ghgj
	Pizza createPizza(String item,*********** Integer Wufei***************************) {
		System.out.println("hello sunshine");
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
	
	I have Changed the local file at 10:45
}
