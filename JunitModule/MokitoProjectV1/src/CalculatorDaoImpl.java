import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class CalculatorDaoImpl  implements ICalculatorDao
{	public int add(int i,int j)
	{	return (i+j);
	}
	@Override
	public List<Integer> getIntListFromDao(int count)throws NegativeNumberException 
	{	ArrayList<Integer> intList=null;
		if(count<0)
		{throw new NegativeNumberException("Negative Count "
					+ "  Sorry Cannot Generate  Integer");
		}
		else
		{	intList=new ArrayList<Integer>();
			for(int i=1;i<=count;i++)
			{
				intList.add(new Integer(i+3));
			}
		}
		System.out.println(" In dao .........."+intList);
		return intList;
	}

	@Override
	public void dispCalcType() {
		System.out.println("Simple");
		
	}

	@Override
	public void setCount(int count) throws NegativeNumberException
	{if(count<0)
		{	throw new NegativeNumberException("Negative Count "
					+ "  Sorry Cannot Generate  Integer");
		}
		else
		{System.out.println("Count Is : "+count);
		}		
	}

}
