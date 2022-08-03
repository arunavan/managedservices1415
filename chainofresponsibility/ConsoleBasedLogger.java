package chainofresponsibility;
public class ConsoleBasedLogger extends Logger {
	
	
	public ConsoleBasedLogger(int levels) {
		// TODO Auto-generated constructor stub
		this.levels=levels;
	}

	
	
	@Override
	protected void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
		
		System.out.println("CONSOLE LOGGER INFO: "+msg);
	}

}
