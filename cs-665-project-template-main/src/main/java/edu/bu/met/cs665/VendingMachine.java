package vending_machine;

public class VendingMachine {
	float CreateOrder(Drink _drink)
	{
		// Calculate price of beverage, store as float for later use
		float basePrice = (float)2.0;
		float additionPrice = (float)((0.5 * _drink.sugar) + (0.5 * _drink.milk));
		float totalPrice = basePrice + additionPrice;
		
		/*
		 * Run process of creating order here using Drink object
		 */
		
		return totalPrice;
	}
}
