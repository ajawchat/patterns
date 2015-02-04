package Decorator;

public abstract class Size extends Beverage{
	public abstract String getDescription();
}


//************************************

class Tall extends Size{
	
	// This object reference is for the object being decorated
	Beverage beverage;
	
	public Tall(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Size: TALL";
	}

	@Override
	public double cost() {
		return beverage.cost() * 1.0;
	}
	
}


//************************************

class Grande extends Size{
	
	// This object reference is for the object being decorated
	Beverage beverage;
	
	public Grande(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Size: Grande";
	}

	@Override
	public double cost() {
		return beverage.cost() * 1.5;
	}
	
}