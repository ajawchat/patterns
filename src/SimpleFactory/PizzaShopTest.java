package SimpleFactory;

public class PizzaShopTest {

	public static void main(String[] args) {
		
		PizzaShop nyc = new NYPizzaShop();
		nyc.orderPizza("Cheese");
		
		System.out.println();
		
		PizzaShop chicago = new ChicagoPizzaShop();
		chicago.orderPizza("Veggie");

	}

}
