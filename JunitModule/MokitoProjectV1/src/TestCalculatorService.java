import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.Stubber;

import junit.framework.Assert;

public class TestCalculatorService 
{	
	ICalculatorService calcSer=null;		
	ICalculatorDao mockCalcDao=null;		
	List<Integer> intL=null;
	@Before
	public  void setUp() throws NegativeNumberException
	{				
		//setup		
		mockCalcDao=Mockito.mock(ICalculatorDao.class);			
		calcSer=new CalculatorServiceImpl(mockCalcDao,"Simple");		
	}
	@Test 
	public void testPerform()
	{		
		Mockito.when(mockCalcDao.add(7, 3)).thenReturn(10);
		Assert.assertEquals(60,calcSer.perform(7, 3));
		Assert.assertEquals(60,calcSer.perform(7, 3));
		//Mockito.verify(mockCalcDao).add(7, 3);
		 //check if add function is called two times
		Mockito.verify(mockCalcDao, Mockito.times(2)).add(7, 3);

	}
	@Test 
	public void testgetIntListSuccess1() throws NegativeNumberException
	{			
		Mockito.when(mockCalcDao.getIntListFromDao(5)).
		thenReturn(Arrays.asList(3,5,7,9,7));			
		intL=calcSer.getIntList(5);			
		Assert.assertNotNull(intL);
		//Verification
		Mockito.verify(mockCalcDao).getIntListFromDao(5);
	}
	@Test 
	public void testgetIntListSuccess2() throws NegativeNumberException
	{			
		//Mockito.when(mockCalcDao.getIntListFromDao(6)).thenReturn(Arrays.asList(3,5,7,9,7,9));
		/********** OR******************/
		Mockito.doReturn(Arrays.asList(3,5,7,9,7,9)).when(mockCalcDao).
		getIntListFromDao(6);	  

		intL=calcSer.getIntList(6);		
		Assert.assertEquals(6,intL.size());
		Mockito.verify(mockCalcDao).getIntListFromDao(6);
	}	
	@Test (expected=NegativeNumberException.class)
	public void testgetIntListSuccess3() throws NegativeNumberException 
	{		
		Mockito.when(mockCalcDao.getIntListFromDao(-1)).
		thenThrow( new  NegativeNumberException());		
		intL=calcSer.getIntList(-1);	
	}

	@Test 
	public void testDispCalcType()  
	{			
		System.out.println("Do Nothing when dao call  dispCalcType function"); 
		Mockito.doNothing().when(mockCalcDao).dispCalcType(); 		
		calcSer.dispCalcType();	 

	}
	@Test(expected=NegativeNumberException.class)
	public void testSetCount1() throws NegativeNumberException  
	{	
		System.out.println("Test Throw   NegativeNumber Exception in void function"); 
		Stubber stubber=Mockito.doThrow(
				new NegativeNumberException());
		stubber.when(mockCalcDao).setCount(-8);
		calcSer.setCount(-8);	
	}
	@Test 
	public void testSetCount2() throws NegativeNumberException  
	{			
		System.out.println("Do Nothing when dao call  setCount function"); 
		Mockito.doNothing().when(mockCalcDao).setCount(7); 		
		calcSer.setCount(7);	 
	}
	@Test 
	public void testDispCalcType2()  
	{	
		Mockito.doAnswer(new Answer<Object>()
				{ 
					public Object answer(InvocationOnMock invocation)
					{ 
							Object[] args = invocation.getArguments(); 
							//Mock mock = (Mock) invocation.getMock(); 
							return null; 
					} 
				}).when(mockCalcDao).dispCalcType(); 		
		calcSer.dispCalcType();	 
	}
}
