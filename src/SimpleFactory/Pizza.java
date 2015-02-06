// SimpleFactory is not a design pattern, but a OO way of simplifying object creation process. We create an object 
// which takes care of our concrete class object creations. 

package SimpleFactory;


// This is an abstract class. A general pizza type which will be inherited by specific pizza classes.
public abstract class Pizza {
	String name;
	
	void preparePizza(){
		System.out.println("Preparing Pizza");;
	}
	
	void bakePizza(){
		System.out.println("Baking Pizza");;
	}
	
	void cutPizza(){
		System.out.println("Cutting Pizza in diagonals");
	}
	
	
	// Instead of a factory method, we create an abstract method here itself. 
	
}



//****************************************************************

class NYCheesePizza extends Pizza{

	
	
}


//****************************************************************

class NYVeggiePizza extends Pizza{

	
	
}



//**********************************************************

class ChicagoCheesePizza extends Pizza{

	
	
	public void cutPizza(){
		System.out.println("Cutting Pizza in rectangles");
	}
	
}


//**********************************************************

class ChicagoVeggiePizza extends Pizza{

	
	
	public void cutPizza(){
		System.out.println("Cutting Pizza in rectangles");
	}
	
}