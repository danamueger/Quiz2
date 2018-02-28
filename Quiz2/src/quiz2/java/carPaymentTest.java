package quiz2.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class carPaymentTest {
	int monthlyPayment;
	

	
	@Test
	public void testMonthlyPayment() {
		assertEquals(743.65, carPayment.monthlyPayment(35000, .10, 0, 5));
		fail("Not yet implemented");
	}

	
	@Test
	public void testTotalInterest() {
		assertEquals(9618.79, carPayment.totalInterest(monthlyPayment, 5));
		fail("Not yet implemented");
	}

}
