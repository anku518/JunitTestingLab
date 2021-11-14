package testing;

import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;


public class divideTest {

	/**
     * Positive Test Case.
     * When Numerator is divisible by denominator
     */
	@Test
	public void testDivisionReturnPositiveCase() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(100, 10);
		assertEquals(10, output);
	}

	 /**
     * Negative Test Case.
     * When denominator is zero, it throws an Exception
     */
	@Test(expected = ArithmeticException.class)
	public void testDivisionReturnNegativeCase() {
		JunitTesting test = new JunitTesting();
		test.divide(10, 0);
	}

}
