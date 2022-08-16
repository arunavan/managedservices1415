import java.sql.SQLException;
import java.util.List;
public interface ICalculatorService 
{
	public int perform(int a,int b);
	public List<Integer> getIntList(int count)
	throws NegativeNumberException;
	public void dispCalcType();
	public void setCount(int count)throws NegativeNumberException;
}
