// SimpleFactory is not a design pattern, but a OO way of simplifying object creation process. We create an object 
// which takes care of our concrete class object creations. 

package SimpleFactory;

// This is an abstract class. A general pizza type which will be inherited by specific pizza classes.
public abstract class Pizza {
	String name;
	
	public abstract void preparePizza();
	
	public abstract void bakePizza();
	
	public abstract void cutPizza();

}



//****************************************************************

class CheesePizza extends Pizza{

	@Override
	public void preparePizza() {
		System.out.println("Preparing Cheese Pizza");
		
	}

	@Override
	public void bakePizza() {
		System.out.println("Baking Cheese Pizza");
		
	}

	@Override
	public void cutPizza() {
		System.out.println("Cutting Cheese Pizza");
		
	}
	
}


//**********************************************************

class VeggiePizza extends Pizza{

	@Override
	public void preparePizza() {
		System.out.println("Preparing Veggie Pizza");
		
	}

	@Override
	public void bakePizza() {
		System.out.println("Baking Veggie Pizza");
		
	}

	@Override
	public void cutPizza() {
		System.out.println("Cutting Veggie Pizza");
		
	}
	
}