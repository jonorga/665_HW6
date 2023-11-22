package vending_machine;

public class Customer {
	VendingMachine _vendingMachine = new VendingMachine();
	Drink _drink;
	
	String DrinkType;
	int sugar;
	int milk;
	
	// Constructor method to create customers order
	public Customer(String DrinkType, int sugar, int milk)
	{
		if (sugar > 3) sugar = 3;
		if (sugar < 0) sugar = 0;
		if (milk > 3) milk = 3;
		if (milk < 0) milk = 0;
		
		if (DrinkType.equals("Espresso") || DrinkType.equals("Americano") || DrinkType.equals("Latte"))
			_drink = new Coffee(DrinkType, sugar, milk);
		else
			_drink = new Tea(DrinkType, sugar, milk);
	}
	
	// Send order to vending machine
	public float PlaceOrder() { return _vendingMachine.CreateOrder(_drink); }
}
