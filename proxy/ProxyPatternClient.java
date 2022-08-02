package proxy;

public class ProxyPatternClient {
	
	public static void main(String[] args) 
	{
		OfficeInternetAccess access = new RealInternetAccess("Ashwani Rajput");
		
		access.grantInternetAccess();
	}


}
