/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/22/2023
 * File Name: Customer.java
 * Description: This file contains the Customer class. It contains the Customer constructor and the 
 * PlaceOrder method. It also contains a VendingMachine and Drink object, and the variables that will
 * be assigned to the Drink object.
 */

package vending_machine;

public class Customer {
	VendingMachine _vendingMachine = new VendingMachine();
	Drink _drink;
	
	String DrinkType;
	int sugar;
	int milk;
	
	/**
     * Constructor method for the Customer to create drink type
     */
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
	
	/**
     * Send order to vending machine, return drink price
     * @return float
     */
	public float PlaceOrder() { return _vendingMachine.CreateOrder(_drink); }
}
