package Decorator;

abstract class CondimentDecorator extends Beverage{
	public abstract String getDescription(); 
}

//************************************

class Mocha extends CondimentDecorator{
	
	// This object reference is for the object being decorated
	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}
	
}


//************************************

class Milk extends CondimentDecorator{
	
	// This object reference is for the object being decorated
	Beverage beverage;
	
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.30;
	}
	
}


