/* This is the pizza shop application which accepts pizza types and dynamically creates the objects of the
 * the specified pizza. 
 */

package SimpleFactory;

import java.util.Scanner;

public class PizzaShop {
	
	public static void main(String[] args) {
		
		Pizza pizza = null;
		
		// Create an instance of the PizzaSimpleFactory Method
		PizzaSimpleFactory pizzaFactory = new PizzaSimpleFactory();
		
		Scanner scanInput = new Scanner(System.in);
		String pizzaType = null;
		
		System.out.println("Enter choice of Pizza: ");
		if(scanInput.hasNextLine()){
			pizzaType = scanInput.nextLine();
		}
		
		// The Factory method orderPizza returns specific object of pizza, which can then be worked on
		pizza = pizzaFactory.orderPizza(pizzaType);
		
		// These are the methods which are constant
		pizza.preparePizza();
		pizza.bakePizza();
		pizza.cutPizza();

	}

}
