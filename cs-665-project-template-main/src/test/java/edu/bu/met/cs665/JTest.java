package test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

//import org.junit.jupiter.api.Test;
import org.junit.Test;

import vending_machine.Customer;

public class JTest {

	@Test
	public void TestCoffee() {
		Customer testCase = new Customer("Americano", 2, 2);
		assertEquals(4.0, testCase.PlaceOrder(), 0);
	}
	
	@Test
	public void TestTooManyAddons() {
		Customer testCase = new Customer("Green Tea", 5, 2);
		assertEquals(4.5, testCase.PlaceOrder(), 0);
	}
	
	@Test
	public void TestBadInput() {
		Customer testCase = new Customer("Yellow Tea", -1, 2);
		assertEquals(3.0, testCase.PlaceOrder(), 0);
	}
}
