package learning.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {
	
	I hava Changed the File at 2020/12/16

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
}
