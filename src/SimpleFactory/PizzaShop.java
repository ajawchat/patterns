/* This is the pizza shop application which accepts pizza types and dynamically creates the objects of the
 * the specified pizza. 
 */

package SimpleFactory;

import java.util.Scanner;

public class PizzaShop {
	
	public static void main(String[] args) {
		
		Pizza pizza = null;
		
		Scanner scanInput = new Scanner(System.in);
		String pizzaType = null;
		
		System.out.println("Enter choice of Pizza: ");
		if(scanInput.hasNextLine()){
			pizzaType = scanInput.nextLine();
		}
		
		if(pizzaType.equals("Cheese"))
			pizza = new CheesePizza();
		else if (pizzaType.equals("Veggie"))
			pizza = new VeggiePizza();
		else
			System.out.println("Please enter a valid option");
		
		
		
		// These are the methods which are constant
		pizza.preparePizza();
		pizza.bakePizza();
		pizza.cutPizza();

	}

}
