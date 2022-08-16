import java.util.List;
import java.sql.SQLException;

public class CalculatorServiceImpl implements ICalculatorService
{
	String calcType;
	ICalculatorDao calcDao;
	public CalculatorServiceImpl() {}
	public CalculatorServiceImpl(ICalculatorDao calcDao,String calcType)
	{
		this.calcDao=calcDao;
		this.calcType=calcType;
		
	}
	public void dispCalcType()
	{
		calcDao.dispCalcType();
	}
	public ICalculatorDao getCalcDao() {
		return calcDao;
	}
	public void setCalcDao(ICalculatorDao calcDao)
	{
		this.calcDao = calcDao;
	}
	@Override
	public int perform(int a, int b) 
	{		
		return calcDao.add(a,b)*6;
		//return (a+b)*6;
	}
	@Override
	public List<Integer> getIntList(int count) throws NegativeNumberException
	{
		List<Integer> intL=calcDao.getIntListFromDao(count);;
		return intL;
	}
	@Override
	public void setCount(int count) throws NegativeNumberException 
	{
		calcDao.setCount(count);
	}

}
