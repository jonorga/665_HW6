/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/22/2023
 * File Name: VendingMachine.java
 * Description: This file contains the VendingMachine class. It contains the CreateOrder method which is what gets
 * called when the customer creates their order.
 */

package vending_machine;

public class VendingMachine {
	/**
     * CreateOrder method to actually create the drink and calculate it's price.
     * @return float
     */
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
