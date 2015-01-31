package Strategy;

// This interface declares the function to add different discounts
public interface IDiscount {
	public int getFinalAmount(int billAmount);
}

//We implement class LowDiscount for 10% discounts that inherit the Discount interface and implement the function
class LowDiscount implements IDiscount{

	public int getFinalAmount(int billAmount) {
		return (int) (billAmount - (billAmount*0.1));
	}
}

//We implement class HighDiscount for 60% discounts that inherit the Discount interface and implement the function
class HighDiscount implements IDiscount{

	public int getFinalAmount(int billAmount) {
		return (int) (billAmount - (billAmount*0.6));
	}
	
}


//We implement class NoDiscount for 0% discounts that inherit the Discount interface and implement the function
class NoDiscount implements IDiscount{

	public int getFinalAmount(int billAmount) {
		return billAmount;
	}
	
}




