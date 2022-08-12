import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoanTest {

	@Test // testcase method 
	void testGetEmi() {
		Loan l=new Loan();
		int actualValue=l.getEmi(60000);
		int expectedValue=5000;
		//assertEquals(actualValue,expectedValue);
		String name=null;// "java";
		//assertNotNull(name);
		assertNull(name);
		
		//fail("Not yet implemented");
	}
	@Test // testcase method 
	void testGetEmiNegative() {
		String name=null;// "java";
		assertNotNull(name);
				
		//fail("Not yet implemented");
	}

}
