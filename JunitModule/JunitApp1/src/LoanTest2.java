import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanTest2 {
	Loan loan;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		loan=new Loan();//initialize 
	}

	@AfterEach
	void tearDown() throws Exception {
		loan=null;  //releasing resources 
		
	}

	@Test
	void testGetEmi() {
		
		assertEquals(9000,loan.getEmi(60000));
		
		//fail("Not yet implemented");
	}

}
 