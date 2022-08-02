package adapter;


public class AdapterPatternTest {
	public static void main(String[] args) {
		testClassAdapter();	}
	private static void testClassAdapter() {
		ElectricSocketAdapter sockAdapter = new ElectricSocketClassAdapterImpl();
		ElectricVolt v3 = getVolt(sockAdapter,3);
	//	ElectricVolt v12 = getVolt(sockAdapter,12);
	//	ElectricVolt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Class Adapter="+v3.getVolts());
	//	System.out.println("v12 volts using Class Adapter="+v12.getVolts());
	//	System.out.println("v120 volts using Class Adapter="+v120.getVolts());
	}
	private static ElectricVolt getVolt(ElectricSocketAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		case 120: return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
		}	}
}

