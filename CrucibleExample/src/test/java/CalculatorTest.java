package test.java;

import junit.framework.Assert;
import main.java.Calculator;
import main.java.MathHelper;
import main.java.exception.NegativeValueException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	private static Calculator calculator;
	
	/**
	 * This method is executed once and prior to all test methods of the test class. Needs to be static.
	 * BeforeClass methods of superclasses are executed prior to BeforeClass methods of the current class.
	 */
	@BeforeClass
	public static void setUpEnvironment() {
		calculator = new Calculator();
	}
	
	/** 
	 * Test annotation defines that this is a test method.
	 * Note that any method which does not have a test annotation is considered a help method and not
	 * executed unless it is executed by a test method.
	 * @throws Exception
	 */
	@Test
	public void testAddition() throws Exception {
		calculator.setX(3);
		calculator.setY(2);
		calculator.setOperator(MathHelper.ADDITION);
		Assert.assertEquals("Calculator did not add correctly", 5.0, calculator.calculate(), 0.01);
	}
	
	@Test
	public void testSubtraction() throws Exception {
		calculator.setX(5);
		calculator.setY(2);
		calculator.setOperator(MathHelper.SUBTRACTION);
		Assert.assertEquals("Calculator did not subtract correctly", 3.0, calculator.calculate(), 0.01 );
	}
	
	@Test
	public void testMultiplication() throws Exception {
		calculator.setX(4);
		calculator.setY(2);
		calculator.setOperator(MathHelper.MULTIPLICATION);
		Assert.assertEquals("Calculator did not multiply correctly", 8.0, calculator.calculate(), 0.01 );
	}
	
	/**
	 * The ignore annotation indicates that this test method is not executed when the test class is executed.
	 * Normally this happens when test methods are testing behavior that is not implemented yet.
	 * @throws Exception
	 */
	@Test
	@Ignore("Dividing not yet implemented")
	public void testDivision() throws Exception {
		calculator.setX(8);
		calculator.setY(2);
		calculator.setOperator(MathHelper.DIVISION);
		Assert.assertEquals("Calculator did not divide correctly", 4.0, calculator.calculate(), 0.01 );
	}	
	
	/**
	 * If a test method is expected to throw an exception, the expected exception can be defined.
	 * If another exception or no exception is thrown, the test method fails.
	 * @throws Exception
	 */
	@Test(expected = NegativeValueException.class)
	public void testIllegalResult() throws Exception {
		calculator.setX(3);
		calculator.setY(5);
		calculator.setOperator(MathHelper.SUBTRACTION);
		calculator.calculate();
	}
	
	/**
	* This method is executed once and after to all test methods of the test class. Needs to be static.
	 * AfterClass methods of superclasses are executed after to AfterClass methods of the current class.
	 */
	@AfterClass
	public static void tearDownEnvironment() {
		calculator = null;
	}

}
