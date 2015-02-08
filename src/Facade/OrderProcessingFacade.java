package Facade;

public class OrderProcessingFacade {
	
	private Item1 item1Obj;
	private DeliveryTime deliveryTimeObj;
	
	public OrderProcessingFacade() {
		item1Obj = new Item1();
		deliveryTimeObj = new DeliveryTime();
	}
	
	
	public void orderItem(){
		
		boolean isAvailable = item1Obj.isAvailable();
		if(isAvailable){
			// get the delivery time only if the item is available
			getDeliveryTime();
		}
		
	}
	
	public void getDeliveryTime(){
		 int days = (deliveryTimeObj.returnDeliveryDays());
		 System.out.println("Item will be delivered in "+days+" days.");
	}
}
