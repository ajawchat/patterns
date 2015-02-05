// This is the factory class that manages to create the objects runtime

package SimpleFactory;

public class PizzaSimpleFactory {
	
	public Pizza orderPizza(String pizzaType){
		
		Pizza pizza = null;
		
		if(pizzaType.equals("Cheese"))
			pizza = new CheesePizza();
		else if (pizzaType.equals("Veggie"))
			pizza = new VeggiePizza();
		else
			System.out.println("Please enter a valid option");
		
		
		return pizza;
	}
	
}
