package Strategy;
/* Create a shopping mall application which has 3 types of discounts based on day
 * 1. Monday : 10% 
 * 2. wed : 60%
 * 3. Fri : 0%
 */



class ShoppingMall{
	String custName;
	int billAmount;
	
	// Create an instance of the interface
	public IDiscount discountType;
	
	//Constructor to get the customer name and billAmount
	public ShoppingMall(String custName, int billAmount){
		this.custName = custName;
		this.billAmount = billAmount;
	}
	
	// Assign the object to the discountType at runtime
	public void setDiscountType(IDiscount discountType){
		this.discountType = discountType;
	}
	
	
	// Returns the final bill calculating the discount based on the object of discountType
	public int GetFinalBill(){
		return discountType.getFinalAmount(this.billAmount);
	}
	
	
}

// Class to test the code 
public class Strategy {
	public static void main(String[] args) {
		ShoppingMall obj1 = new ShoppingMall("Ajinkya",3000);
		
		String day = "M";
		
		switch(day){
			case "M": 
				obj1.setDiscountType(new LowDiscount());
				break;
			case "TH":
				obj1.setDiscountType(new HighDiscount());
				break;
			case "F":
				obj1.setDiscountType(new NoDiscount());
				break;
		}
		
		System.out.println("Bill Details: Name: "+obj1.custName+ "  Bill: "+obj1.GetFinalBill());
		
		
	}

}
