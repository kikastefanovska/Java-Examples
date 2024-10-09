package mk.iwec.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.Test;

import mk.iwec.main.Calculator;
import mk.iwec.main.Person;

public class TestCalculator {
	
	private Calculator calculator;
	private Person person;
	@Before
	public void setUp() {
		calculator = new Calculator();
		person = new Person("Ivo","Ivov");
	}
	@Test
	public void testAddition() {
		int result = calculator.add(2, 3);
		assertEquals(5,result);
	}
	
	@Test
	public void testDevisionByZero() {
		assertThrows(ArithmeticException.class, () -> {
			calculator.divide(5, 0);
		});
		
	}
	
	@Test
	public void testStringLenght() {
		String str ="Junit 5";
		assertEquals(7,str.length());
	}
	@Test
	public void testArrayEquals() {
		int [] expectedArray = {1,2,3};
		int [] actualArray = {1,2,3};
		assertArrayEquals(expectedArray,actualArray);
	}
	@Test 
	public void testNotNull() {
		Object obj = new Object();
		assertNotNull(obj);
	}
	@Test
	public void testGroupAssertion() {
		assertAll("person",
		()-> assertEquals("Ivo", person.getFistName()),
		() ->assertEquals("Ivov",person.getLastName())
		);
	}
	
}
