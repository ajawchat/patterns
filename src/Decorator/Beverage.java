package Decorator;

public abstract class Beverage {
	String description = "unknown beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}

//************************************************************




//************************************************************

class Espresso extends Beverage{
	
	public Espresso(){
		description = "Espresso";
	}
	
	public double cost() {
		return 1.99;
	}
}

//************************************************************

class DarkRoast extends Beverage{
	
	public DarkRoast(){
		description = "Dark Roast";
	}
	
	public double cost() {
		return 1.0;
	}
}

//************************************************************




