// Author: Ben Trane and Kyle Stucki
// Built to test the AddThenDivide.java class and BackToSchoolShopping.java class

// Import the tools we need
import static org.junit.Assert.*;
import org.junit.Test;

// Class called Addition
public class JUnitTestAssert {

	String obj1 = "Tree";
	String obj2 = "Shrub";
	String obj3 = "flower";
	String obj5 = null;
	int[] arithmetic1 = { 1, 2, 3 };
	int[] arithmetic2 = { 1, 2, 3 };

	// The Test annotation tells JUnit that the public void method to which it
	// is attached can be run as a test case.
	@SuppressWarnings("static-access")
	@Test
	// Method additionTest
	public void additionTest1() {

		// Create a test object named test from the JUnit class
		AddThenDivide test = new AddThenDivide();
		// Make a call to the method additionTest and store returned result
		double remainder = test.additionTest(32.80, 33.25);
		// Assert if the remaider equals what the actual correct return should
		// be
		assertEquals(remainder, 66.05, 0);
	}

	@SuppressWarnings("static-access")
	@Test
	public void multiplyTest1() {

		AddThenDivide test = new AddThenDivide();
		double remainder = test.multiplyTest(12, 3);
		assertEquals(remainder, 36, 0);
	}

	@SuppressWarnings("static-access")
	@Test
	public void multiplyTest2() {

		AddThenDivide test = new AddThenDivide();
		double remainder = test.multiplyTest(3.50, 4.75);
		assertEquals(remainder, 16.625, 0);
	}

	// Various tests to show different assert types
	@Test
	public void assertSameTest() {
		assertSame(obj1, obj2);
	}

	@Test
	public void assertSameTest2() {
		assertSame(obj1, obj3);
	}

	@Test
	public void assertNotSameTest() {
		assertNotSame(obj2, obj3);
	}

	@Test
	public void assertNotNullTest() {
		assertNotNull(obj1);
	}

	@Test
	public void assertNullTest() {
		assertNull(obj5);
	}

	// Full on assertArrayEquals Test
	BackToSchoolShopping backToSchool = new BackToSchoolShopping();

	String[] cart1 = {"TextBooks", "Laptop", "Pens"};

	String[] cart2 = {"TextBooks", "Laptop", "Pens", "Paper", "Pencils"};

	@Test
	public void testPrepareMyBag() {

		assertArrayEquals(cart1, backToSchool.prepareTheCart());
	}

	@Test
	public void testAddPencils() {
		
		assertArrayEquals(cart2, backToSchool.addPaperAndPencils());
	}
}
