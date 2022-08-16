import java.util.List;
import java.sql.SQLException;

public interface ICalculatorDao
{
	public int add(int i,int j);
	public List<Integer> getIntListFromDao(int count)throws NegativeNumberException;
	public void dispCalcType();
	public void setCount(int count)throws NegativeNumberException;;
}
