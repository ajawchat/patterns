package Decorator;

public class DecoratorTest {
	
	public static void main(String[] args) {
		
		Beverage beverage1 = new Espresso();
		
		System.out.println(beverage1.getDescription());
		System.out.println(beverage1.cost());
		
		// Add decorators to it
		beverage1 = new Mocha(beverage1);
		beverage1 = new Mocha(beverage1);
		beverage1 = new Milk(beverage1);
		beverage1 = new Grande(beverage1);
		
		
		System.out.println(beverage1.getDescription());
		System.out.println(beverage1.cost());
	}

}
