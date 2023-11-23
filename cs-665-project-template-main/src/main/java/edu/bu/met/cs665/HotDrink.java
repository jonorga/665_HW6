/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/22/2023
 * File Name: HotDrink.java
 * Description: This file contains the HotDrink class. It inherits from the Drink class and implements
 * a class constructor.
 */

package vending_machine;

public class HotDrink extends Drink {
	/**
     * Constructor method for HotDrink class to set variables.
     */
	public HotDrink(String DrinkType, int sugar, int milk)
	{
		this.DrinkType = DrinkType;
		this.sugar = sugar;
		this.milk = milk;
	}
}
