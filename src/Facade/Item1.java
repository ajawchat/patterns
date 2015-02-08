package Facade;

public class Item1 {
	private int itemsLeft = 10;
	
	public boolean isAvailable(){
		return (itemsLeft > 0);
	}
}
