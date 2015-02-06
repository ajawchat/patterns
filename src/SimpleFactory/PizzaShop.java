/* This is the pizza shop application which accepts pizza types and dynamically creates the objects of the
 * the specified pizza. 
 */

package SimpleFactory;

import java.util.Scanner;

public abstract class PizzaShop {
		
	
	public Pizza orderPizza(String pizzaType){
		
		Pizza pizza = null;
		
		pizza = createPizza(pizzaType);
		
		pizza.preparePizza();
		pizza.bakePizza();
		pizza.cutPizza();

		
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
	

}





// While making a franchise of PizzaShop, we would need the orderPizza and createPizza under these objects

class NYPizzaShop extends PizzaShop{

	@Override
	public Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		
		if(pizzaType.equals("Cheese"))
			pizza = new NYCheesePizza();
		else if (pizzaType.equals("Veggie"))
			pizza = new NYVeggiePizza();
		else
			System.out.println("Please enter a valid option");
		
		
		return pizza;
	}
	
}

//**********************************************

class ChicagoPizzaShop extends PizzaShop{

	@Override
	public Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		
		if(pizzaType.equals("Cheese"))
			pizza = new ChicagoCheesePizza();
		else if (pizzaType.equals("Veggie"))
			pizza = new ChicagoVeggiePizza();
		else
			System.out.println("Please enter a valid option");
		
		
		return pizza;
	}
	
}


