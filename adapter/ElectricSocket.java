package adapter;


public class ElectricSocket {

	public ElectricVolt getVolt(){
		return new ElectricVolt(120);
	}
}
